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

## Project Notes
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
    │       └── application.properties                        * Config file
    └── test
        └── java
            └── com
                └── sbexamples
                    └── example1
                        └── Example1ApplicationTests.java     * JUnit test

</pre>

## Maven pom.xml Notes
Here are some interesting points about the project's Maven POM...
```xml
<project>

  <groupId>com.sbexamples</groupId>
  <artifactId>example1</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>example1</name>
  <description>Demo project for Spring Boot</description>

  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.3.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>

  <dependencies>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
    
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>

</project>
```
