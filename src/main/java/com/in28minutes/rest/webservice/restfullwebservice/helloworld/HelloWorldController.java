package com.in28minutes.rest.webservice.restfullwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static final String HELLO_WORLD = "Hello World";

	@GetMapping("/hello-world")
	public String helloWorld() {

		return HELLO_WORLD;

	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {

		return new HelloWorldBean(HELLO_WORLD);

	}

	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {

		return new HelloWorldBean(String.format("Hello World  , %s", name));

	}
}
