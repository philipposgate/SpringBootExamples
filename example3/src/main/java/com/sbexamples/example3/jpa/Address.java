package com.sbexamples.example3.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String streetAddress;
	private String suiteNumber;
	private String city;
	private String province;
	private String country;
	private String postalCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getSuiteNumber() {
		return suiteNumber;
	}
	public void setSuiteNumber(String suiteNumber) {
		this.suiteNumber = suiteNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
