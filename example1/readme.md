# Example 1
The most basic Spring-Boot example of a "hello world" REST service.

## How to build and run

```
  > cd example1
  > mvn clean install
  > mvn spring-boot:run
```

## How to use

* Using a web browser: http://localhost:8080/hello

## Project Structure
This is a Spring-Boot application in a Maven configuration.  Here is a description of all the assets within...
<pre>
├── pom.xml                                                   * Maven pom file
├── readme.md                                                 * This readme file
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── sbexamples
    │   │           └── example1
    │   │               ├── Example1Application.java          * @SpringBootApplication class
    │   │               └── Example1Controller.java           * @RestController class with GET /hello endpoint
    │   └── resources
    │       └── application.properties                        * Application config file
    └── test
        └── java
            └── com
                └── sbexamples
                    └── example1
                        └── Example1ApplicationTests.java     * JUnit test

</pre>


