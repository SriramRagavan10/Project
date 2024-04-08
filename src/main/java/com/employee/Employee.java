package com.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

	@GetMapping(value = "/emp")
	public String get() {
		return "Name: Sriram" + "Role: Developer";
	}

}
