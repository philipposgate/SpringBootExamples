package com.sbexamples.example3.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

@Entity(name="CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@ApiModelProperty(position = 1)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@ApiModelProperty(position = 2, example = "John")
	private String firstName;
	
	@ApiModelProperty(position = 3, example = "Smith")
	private String lastName;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(notes = "yyyy-MM-dd", example = "1969-03-26")
	private Date dateOfBirth;

	@ApiModelProperty(example = "555 555-5555")
	private String contactPhoneNumber;
	
	@ApiModelProperty(example = "john.smith@email.com")
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
