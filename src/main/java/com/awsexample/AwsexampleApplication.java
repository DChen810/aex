package com.awsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsexampleApplication {
	
	@GetMapping("/a")
	public String a() {
		return "hi";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsexampleApplication.class, args);
	}

}
