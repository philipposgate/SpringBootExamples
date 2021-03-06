# Example 3
An example of a Spring-Boot Data REST service. Demonstration of CRUD operations with JPA and H2 database.  

## How to build and run

```
  > cd example3
  > mvn clean install
  > mvn spring-boot:run
```

## How to use

* Using a web browser: http://localhost:8080/customers
* Swagger UI at: http://localhost:8080/swagger-ui.html
* HAL Browser at: http://localhost:8080/browser
* H2 Console at: http://localhost:8080/h2console
	* Driver Class: org.h2.Driver
	* JDBC URL: jdbc:h2:mem:testdb  (or jdbc:h2:~/test)
	* Username: sa
	* Password: [blank]


## Resources
* Spring-Data REST 
	- For building hypermedia-driven REST web services on top of Spring Data repositories.
	- guide @ https://spring.io/guides/gs/accessing-data-rest/
	- reference doc @ http://docs.spring.io/spring-data/rest/docs/current/reference
* SpringFox 
	- Integrates Swagger UI with Spring-Data REST applications
	- homepage @ https://springfox.github.io/springfox/
	- rerference doc @ http://springfox.github.io/springfox/docs/current/
