package com.sbexamples.example2.controller;

import java.util.List;

import javax.validation.Valid;

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

import io.swagger.annotations.ApiOperation;

@RestController
public class Example2Controller {

	@Autowired
	private FooRepository fooRepository;
	
	@RequestMapping(value = "/foo", method = RequestMethod.GET)
	@ApiOperation(value = "Get All Foo's", notes = "Returns all Foo entities from the DB")
	public ResponseEntity<List<Foo>> getAllFoo()
	{
		return new ResponseEntity<List<Foo>>((List<Foo>)fooRepository.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/foo", method = RequestMethod.POST)
	@ApiOperation(value = "Create Foo", notes = "Insert a new Foo entity into the DB")
	public ResponseEntity<Foo> createFoo(@RequestBody @Valid FooPayload newFoo)
	{
		Foo foo = new Foo();
		foo.setName(newFoo.getName());
		foo.setDate(newFoo.getDate());
		foo = fooRepository.save(foo);
		return new ResponseEntity<Foo>(foo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/foo/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Foo", notes = "Retrieve a Foo entity by ID")
	public ResponseEntity<Foo> getFoo(@PathVariable Integer id)
	{
		Foo foo = fooRepository.findByFooId(id);
		ResponseEntity<Foo> responseEntity = 
				foo == null ? 
						new ResponseEntity("Foo " + id + " not found.", HttpStatus.NOT_FOUND) :
							new ResponseEntity<Foo>(foo, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(value = "/foo/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Foo", notes = "Update a Foo entity by ID")
	public ResponseEntity<Foo> updateFoo(@PathVariable Integer id, @RequestBody @Valid FooPayload updatedFoo)
	{
		Foo foo = fooRepository.findByFooId(id);
		ResponseEntity<Foo> responseEntity = null;
		if (foo == null)
		{ 
			responseEntity = new ResponseEntity("Foo " + id + " not found.", HttpStatus.NOT_FOUND);
		}
		else
		{
			foo.setName(updatedFoo.getName());
			foo.setDate(updatedFoo.getDate());
			fooRepository.save(foo);
			responseEntity = new ResponseEntity<Foo>(foo, HttpStatus.OK);
		}
		return responseEntity;
	}

	@RequestMapping(value = "/foo/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Foo", notes = "Delete a Foo entity from DB by ID")
	public ResponseEntity<String> deleteFoo(@PathVariable Integer id)
	{
		Foo foo = fooRepository.findByFooId(id);
		ResponseEntity<String> responseEntity = null;
		if (foo == null)
		{ 
			responseEntity = new ResponseEntity<String>("Foo " + id + " not found.", HttpStatus.NOT_FOUND);
		}
		else
		{
			fooRepository.delete(foo);
			responseEntity = new ResponseEntity<String>("Foo " + id + " deleted.", HttpStatus.OK);
		}
		return responseEntity;
	}
	
}
