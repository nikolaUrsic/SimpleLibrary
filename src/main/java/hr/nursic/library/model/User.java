package hr.nursic.library.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "sex")
	private String sex;
	@Nullable
	@Column(name = "validation")
	private Boolean validation;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Set<PhoneNumber> phoneNumbers = new HashSet<>();
	@Nullable
	@Column(name = "deleted")
	private Date deleted = null;

	public User() {
		super();
	}

	public User(String name, String surname, Date dateOfBirth, String sex, boolean validation,
			Set<PhoneNumber> phoneNumbers) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.validation = validation;
		this.phoneNumbers = phoneNumbers;
	}

	public User(String name, String surname, Date dateOfBirth, String sex, Boolean validation) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.validation = validation;
	}

	public User(String name, String surname, Date dateOfBirth, String sex) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isValidation() {
		return validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public Set<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Boolean getValidation() {
		return validation;
	}

	public void setValidation(Boolean validation) {
		this.validation = validation;
	}

	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", sex=" + sex
				+ ", validation=" + validation + ", phoneNumbers=" + phoneNumbers + ", deleted=" + deleted + "]";
	}
	
	

}
