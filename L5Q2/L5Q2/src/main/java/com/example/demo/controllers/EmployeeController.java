package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
//import com.example.demo.models.Manager;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.ManagerService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@Autowired
	ManagerService ms;
	
	@GetMapping("addEmployee1")
	public String addEmployee1() {
		Employee e = new Employee("E001", "John Kelly");
		es.save(e);
		return "Added Employee 1";
	}

	@GetMapping("addEmployee2")
	public String addEmployee2() {
		Employee e = new Employee("E002", "Mary Collins");
		es.save(e);
		return "Added Employee 2";
	}

	@GetMapping("getEmployee1")
	public String getEmployee1() {
		Optional<Employee> e = es.findById(1);
		return e.get().toString();
	}

	@GetMapping("getEmployee2")
	public String getEmployee2() {
		Optional<Employee> e = es.findById(2);
		return e.get().toString();
	}
}
