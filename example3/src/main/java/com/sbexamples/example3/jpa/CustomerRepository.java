package com.sbexamples.example3.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
