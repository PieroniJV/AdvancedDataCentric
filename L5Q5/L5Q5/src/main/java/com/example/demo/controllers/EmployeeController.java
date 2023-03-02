package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.models.Manager;
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
		Manager m = new Manager("M001", "Tom White");
		e.setManager(m);
		es.save(e);
		return "Added Employee 1";
	}
	
	@GetMapping("addEmployee2")
	public String addEmployee2() {
		Employee e = new Employee("E002", "Mary Collins");
		Optional<Manager> m = ms.findById(1);
		e.setManager(m.get());
		es.save(e);
		return "Added Employee 2";
	}


	@GetMapping("delEmployee1")
	public String delEmployee1() {
		Optional<Employee> e = es.findById(1);
		es.delete(e.get());
		return "Deleted Employee 1";
	}

}
