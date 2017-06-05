package com.sbexamples.example2.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbexamples.example2.domain.Foo;
import com.sbexamples.example2.domain.FooPayload;
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
	
	@RequestMapping(value = "/foo", method = RequestMethod.POST)
	public ResponseEntity<Foo> createFoo(@RequestBody FooPayload newFoo)
	{
		Foo foo = new Foo();
		foo.setName(newFoo.getName());
		foo.setDate(newFoo.getDate());
		foo = fooRepository.save(foo);
		return new ResponseEntity<Foo>(foo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/foo/{id}", method = RequestMethod.GET)
	public ResponseEntity<Foo> getFoo(@PathVariable Integer id)
	{
		return new ResponseEntity<Foo>(fooRepository.findByFooId(id), HttpStatus.OK);
	}
}
