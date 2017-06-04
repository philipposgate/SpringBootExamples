package com.sbexamples.example1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1Controller {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello()
	{
		return "Hello World!";
	}
}
