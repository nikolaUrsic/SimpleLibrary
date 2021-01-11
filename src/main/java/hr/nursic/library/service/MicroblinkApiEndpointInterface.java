package hr.nursic.library.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import hr.nursic.library.dto.user.MRTDRequest;
import hr.nursic.library.dto.user.MRTDResponse;

public interface MicroblinkApiEndpointInterface {

	@Headers("Authorization: Bearer ZGNkNzY1MDQ4YWY0NDZhMjk2ZmVkNDFkMjY3MDhlOTQ6M2JmOGI0MzktNzljMi00MTI0LWE0YTQtMDg5MTJjMjU4YjBm")
	@POST("recognizers/mrtd")
	Call<MRTDResponse> recogniseUser(@Body MRTDRequest request);

}
