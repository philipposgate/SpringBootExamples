package com.sbexamples.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example4Controller {

	@Autowired
	private Web3jService web3j;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() throws Exception
	{
		
		return "Hello World! " + web3j.getClientVersion();
	}
}
