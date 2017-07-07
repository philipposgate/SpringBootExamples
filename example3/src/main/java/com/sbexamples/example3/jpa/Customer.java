package com.sbexamples.example3.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	private String firstName;
	private String lastName;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;

	private String contactPhoneNumber;
	private String contactEmailAddress;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getContactEmailAddress() {
		return contactEmailAddress;
	}

	public void setContactEmailAddress(String contactEmailAddress) {
		this.contactEmailAddress = contactEmailAddress;
	}

}
