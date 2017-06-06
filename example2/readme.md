# Example 2
A slightly more advanced version of a Spring-Boot REST service. Demonstration of CRUD operations with JPA and H2 database.  Demonstration of Swagger UI integration.

## How to build and run

```
  > cd example1
  > mvn clean install
  > mvn spring-boot:run
```

## How to use

* Using a web browser: http://localhost:8080/foo
* Swagger UI at: http://localhost:8080/swagger-ui.html#/example-2-controller
* H2 Console at: http://localhost:8080/console
	* Driver Class: org.h2.Driver
	* JDBC URL: jdbc:h2:mem:testdb  (or jdbc:h2:~/test)
	* Username: sa
	* Password: [blank]

## Project Notes
...
* Swagger UI - http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
