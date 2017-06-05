package com.sbexamples.example2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbexamples.example2.domain.Foo;
import com.sbexamples.example2.repository.FooRepository;

@RestController
public class Example2Controller {

	@Autowired
	private FooRepository fooRepository;
	
	@RequestMapping(value = "/foo", method = RequestMethod.GET)
	public ResponseEntity<List<Foo>> getAllFoo()
	{
		return new ResponseEntity<List<Foo>>((List<Foo>)fooRepository.findAll(), HttpStatus.OK);
	}
}
