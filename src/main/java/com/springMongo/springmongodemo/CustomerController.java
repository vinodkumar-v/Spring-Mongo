package com.springMongo.springmongodemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CustomerController {
	
	@Autowired
	  private CustomerRepository repository;

	@GetMapping("/addcustomer")
	public void customer(@RequestParam(value = "firstName", defaultValue = "World") String firstName, @RequestParam(value = "lastName", defaultValue = "!") String lastName) {
		repository.save(new Customer(firstName, lastName));
	}
	
	@GetMapping("/getcustomerbylastname")
	public List<Customer> customer(@RequestParam(value = "lastName", defaultValue = "World") String lastName) {
		return repository.findByLastName("Smith");
	}
	
	@GetMapping("/shoppinglist")
    public Iterable<String> getShoopingList() {
        return Arrays.asList("bread", "butter" , "jam");
    }
}