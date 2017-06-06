package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestingApplication {
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome To Spring Boot Demo";
     
    }

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}
}
