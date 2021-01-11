package hr.nursic.library.dto.user;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import hr.nursic.library.model.User;


public class UsersOverdueDto {
	
	private LinkedHashMap <UserDto, Long> usersOverdue = new LinkedHashMap <>();
	
	public static UsersOverdueDto fromMapOfUserOverdue(Map<User, Long> mapOfUserOverdue) {
		return new UsersOverdueDto(mapOfUserOverdue);
	}
	
	public UsersOverdueDto(Map<User, Long> mapOfUserOverdue) {
		mapOfUserOverdue.entrySet()
		.stream()
		//.limit(3)
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEachOrdered(x -> usersOverdue.put(UserDto.fromUser(x.getKey()), x.getValue()));
	}

	public Map<UserDto, Long> getUsersOverdue() {
		return usersOverdue;
	}

	public void setUsersOverdue(LinkedHashMap <UserDto, Long> usersOverdue) {
		this.usersOverdue = usersOverdue;
	}
	

}
