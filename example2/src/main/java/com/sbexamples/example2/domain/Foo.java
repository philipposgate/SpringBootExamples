package com.sbexamples.example2.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Foo")
public class Foo {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer fooId;

	private String name;
	
	private Date date;

	public Integer getFooId() {
		return fooId;
	}

	public void setFoo(Integer fooId) {
		this.fooId = fooId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
