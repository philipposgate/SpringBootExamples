package com.sbexamples.example3.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sbexamples.example3.jpa.Customer;
import com.sbexamples.example3.jpa.CustomerRepository;

@Configuration
@ComponentScan(basePackageClasses={Customer.class})
@EnableJpaRepositories(basePackageClasses={CustomerRepository.class})
public class WebConfiguration {


	@Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/h2console/*");
        return registrationBean;
    }


}
