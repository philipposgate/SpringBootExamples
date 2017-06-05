package com.sbexamples.example2.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity(name="Foo")
@ApiModel
public class Foo {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@ApiModelProperty(example = "1", position = 1)
	private Integer fooId;

	@ApiModelProperty(example = "Philip", position = 2)
	private String name;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(example = "1972-03-30", position = 3)
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
