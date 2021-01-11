package hr.nursic.library.dto.user;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import hr.nursic.library.model.PhoneNumber;
import hr.nursic.library.model.User;

public class UserDto {

	private long id;
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String sex;
	private Set<String> phoneNumbers = new HashSet<>();

	public static UserDto fromUser(User user) {
		return new UserDto(user.getId(), user.getName(), user.getSurname(), user.getDateOfBirth(), user.getSex(),
				user.getPhoneNumbers());
	}

	public UserDto(long id, String name, String surname, Date dateOfBirth, String sex, Set<PhoneNumber> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.sex = sex;
		for (PhoneNumber p : phoneNumbers) {
			this.phoneNumbers.add(p.getNumber());
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
		for (PhoneNumber p : phoneNumbers) {
			this.phoneNumbers.add(p.getNumber());
		}
	}

	@Override
	public String toString() {
		return "User: id=" + id + ", name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth
				+ ", sex=" + sex + ", phoneNumbers=" + phoneNumbers;
	}
	
	

}
