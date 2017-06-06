package com.sbexamples.example2.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class FooPayload {

	@ApiModelProperty(example = "Philip", position = 1)
	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@ApiModelProperty(example = "1972-03-30", position = 2)
	private Date date;

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
