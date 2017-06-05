package com.sbexamples.example2.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sbexamples.example2.domain.Foo;
import com.sbexamples.example2.repository.FooRepository;

@Configuration
@ComponentScan(basePackageClasses={Foo.class})
@EnableJpaRepositories(basePackageClasses={FooRepository.class})
public class WebConfiguration {


	@Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }


}
