package com.example.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	// Get HTTP Method
	// http://localhost:9099/hello-world
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello World";
	}
}
