package com.sbexamples.example2.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class FooPayload {

	@NotNull(message = "Name is required")
	@Size(min = 3, message = "Minimum field length is 3")
	@Pattern(regexp = "^[a-zA-Z.\\\\-\\\\/ ]*$", message = "Letter characters only")
	@ApiModelProperty(example = "Philip", position = 1, required = true)
	private String name;
	
	@NotNull(message = "Date is required")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	@ApiModelProperty(example = "1972-03-30", position = 2, required = true)
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
