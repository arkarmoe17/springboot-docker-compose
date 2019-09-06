package com.arkarmoe.springdockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerComposeApplication {
	@RequestMapping("/")
	public String index(){
		System.out.println("Working.");
		return "Welcome from Docker Compose.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerComposeApplication.class, args);
	}

}
