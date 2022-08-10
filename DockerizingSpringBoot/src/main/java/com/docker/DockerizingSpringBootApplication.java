package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerizingSpringBootApplication {
	
	@GetMapping
	public String getMessage() {
		return "Welcome Docker Test Project";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerizingSpringBootApplication.class, args);
	}

}
