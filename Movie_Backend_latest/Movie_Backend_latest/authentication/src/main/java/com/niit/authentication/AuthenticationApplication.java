package com.niit.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



// `@SpringBootApplication` is a combination of three annotations: `@Configuration`, `@EnableAutoConfiguration`, and
// `@ComponentScan`. It is used to mark the main class of a Spring Boot application and enables auto-configuration and
// component scanning. It also allows the application to be run as a standalone Spring application without requiring any
// XML configuration.
@SpringBootApplication
@EnableEurekaClient
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

}
