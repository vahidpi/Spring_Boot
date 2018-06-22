package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
///@Controller

public class MyserviceApplication {
	/*
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "PAF test project...";
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(MyserviceApplication.class, args);
	}
}
