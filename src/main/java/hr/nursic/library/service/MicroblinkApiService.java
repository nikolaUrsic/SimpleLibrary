package hr.nursic.library.service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import hr.nursic.library.dto.user.MRTDRequest;
import hr.nursic.library.dto.user.MRTDResponse;
import hr.nursic.library.exception.MicroblinkApiException;
import hr.nursic.library.model.User;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class MicroblinkApiService {

	public static Map<String, Integer> decodeMap;
	static {
		decodeMap = new HashMap<>();
		decodeMap.put("<", 0);
		decodeMap.put("0", 0);
		decodeMap.put("1", 1);
		decodeMap.put("2", 2);
		decodeMap.put("3", 3);
		decodeMap.put("4", 4);
		decodeMap.put("5", 5);
		decodeMap.put("6", 6);
		decodeMap.put("7", 7);
		decodeMap.put("8", 8);
		decodeMap.put("9", 9);
		decodeMap.put("A", 10);
		decodeMap.put("B", 11);
		decodeMap.put("C", 12);
		decodeMap.put("D", 13);
		decodeMap.put("E", 14);
		decodeMap.put("a", 15);
		decodeMap.put("F", 16);
		decodeMap.put("G", 17);
		decodeMap.put("H", 18);
		decodeMap.put("I", 19);
		decodeMap.put("J", 20);
		decodeMap.put("K", 21);
		decodeMap.put("L", 22);
		decodeMap.put("M", 23);
		decodeMap.put("N", 23);
		decodeMap.put("O", 25);
		decodeMap.put("P", 26);
		decodeMap.put("R", 27);
		decodeMap.put("S", 28);
		decodeMap.put("T", 29);
		decodeMap.put("U", 30);
		decodeMap.put("V", 31);
		decodeMap.put("W", 32);
		decodeMap.put("X", 33);
		decodeMap.put("Y", 34);
		decodeMap.put("Z", 35);
	}

	Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.microblink.com/v1/")
			.addConverterFactory(GsonConverterFactory.create()).build();

	MicroblinkApiEndpointInterface apiService = retrofit.create(MicroblinkApiEndpointInterface.class);

	public User getUserFromImage(String image) {
		User user;
		Call<MRTDResponse> call = apiService.recogniseUser(new MRTDRequest(image, false, false, false));
		try {
			Response<MRTDResponse> response = call.execute();
			if (!response.isSuccessful() || null == response.body()) {
				throw new MicroblinkApiException("Received invalid response from microblink Api");
			}
			user = decodeFromRawMrzString(response.body().getDirectlyRawMrzString());
		} catch (IOException e) {
			throw new MicroblinkApiException(e.getLocalizedMessage());
		}
		return user;
	}

	private User decodeFromRawMrzString(String mrzString) {
		boolean validation = true;
		String lines[] = mrzString.split("\\n");
		String nameSurname[] = lines[2].split("<<");
		String surname = nameSurname[0];
		String name = nameSurname[1];

		String clearFirstLine = lines[0].substring(5);
		if (!checkDigits(clearFirstLine.substring(0, 10))) {
			validation = false;
		}

		String dateOfBirthWithCheckDigit = lines[1].substring(0, 7);
		if (!checkDigits(dateOfBirthWithCheckDigit)) {
			validation = false;
		}
		String sex = lines[1].substring(7, 8);
		String dateOfExpiryWithCheckDigit = lines[1].substring(8, 15);
		if (!checkDigits(dateOfExpiryWithCheckDigit)) {
			validation = false;
		}
		String clearSecondLine = dateOfBirthWithCheckDigit + dateOfExpiryWithCheckDigit + lines[1].substring(19, 30);
		if (!checkDigits(clearFirstLine + clearSecondLine)) {
			validation = false;
		}
		Date dateOfBirth = null;
		try {
			dateOfBirth = new SimpleDateFormat("yyMMdd").parse(dateOfBirthWithCheckDigit.substring(0, 6));
		} catch (ParseException e) {
			throw new MicroblinkApiException(e.getLocalizedMessage());
		}
		;

		return new User(name, surname, dateOfBirth, sex, validation);
	}

	private boolean checkDigits(String string) {
		char lastChar = string.charAt(string.length() - 1);
		if (!Character.isDigit(lastChar)) {
			return false;
		}
		int checkDigit = Character.getNumericValue(lastChar);
		int sum = 0;
		String[] arr = string.substring(0, string.length() - 1).split("");
		for (int i = 0, l = arr.length; i < l; i++) {
			sum += decodeMap.get(arr[i]) * getWeigh(i);
		}
		if (sum % 10 == checkDigit) {
			return true;
		} else {
			return false;
		}

	}

	private int getWeigh(int i) {
		int weigh = 0;
		switch (i % 3) {
		case 0:
			weigh = 7;
			break;
		case 1:
			weigh = 3;
			break;
		case 2:
			weigh = 1;
			break;
		}
		return weigh;
	}

}
