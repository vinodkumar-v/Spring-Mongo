package com.springMongo.springmongodemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/customer")
	public Customer customer(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Customer(counter.incrementAndGet(), String.format(template, name));
	}
}