package hr.nursic.library.dto.user;

import java.util.ArrayList;
import java.util.List;

import hr.nursic.library.model.User;

public class UsersDto {

	private List<UserDto> users = new ArrayList<>();

	public static UsersDto fromUserList(List<User> userList) {
		List<UserDto> users = new ArrayList<>();
		for (User u : userList) {
			users.add(UserDto.fromUser(u));
		}
		return new UsersDto(users);
	}

	public UsersDto(List<UserDto> users) {
		super();
		this.users = users;
	}

	public List<UserDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserDto> users) {
		this.users = users;
	}

}
