# Example 2
A slightly more advanced version of a Spring-Boot REST service. Demonstration of CRUD operations with JPA and H2 database.  Demonstration of Swagger UI integration.

## How to build and run

```
  > cd example2
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

## Project Structure

<pre>
├── pom.xml							* Maven pom file
├── readme.md							* This readme file
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── sbexamples
    │   │           └── example2
    │   │               ├── Example2Application.java		* @SpringBootApplication class
    │   │               ├── config
    │   │               │   ├── SwaggerConfig.java		* @Configuration class for Swagger UI
    │   │               │   └── WebConfiguration.java		* @Configuration class for H2 console and stuff
    │   │               ├── controller
    │   │               │   └── Example2Controller.java		* @RestController class with /foo endpoints
    │   │               ├── domain
    │   │               │   ├── Foo.java			* @Entity class for Foo
    │   │               │   └── FooPayload.java			* Payload object for POST /foo and PUT /foo 
    │   │               └── repository
    │   │                   └── FooRepository.java		* @Repository class for Foo entity
    │   └── resources
    │       └── application.properties				* Application config file
    └── test
        └── java
            └── com
                └── sbexamples
                    └── example2
                        └── Example2ApplicationTests.java	* JUnit test
</pre>

## Resources
* Swagger UI - http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
