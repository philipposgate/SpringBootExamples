package com.sbexamples.example2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbexamples.example2.domain.Foo;

@Repository
public interface FooRepository extends CrudRepository<Foo, Integer> {

	Foo findByFooId(Integer id);

}
