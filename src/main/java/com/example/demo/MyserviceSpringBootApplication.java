package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller"})
public class MyserviceSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyserviceSpringBootApplication.class, args);
	}
}
