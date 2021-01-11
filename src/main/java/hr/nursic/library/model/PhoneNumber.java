package hr.nursic.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "phone_numbers")
public class PhoneNumber extends AbstractEntity{

	@Column(name = "number")
	private String number;

	public PhoneNumber() {
		super();
	}

	public PhoneNumber(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumber [id=" + getId() + ", number=" + number + "]";
	}
	

}
