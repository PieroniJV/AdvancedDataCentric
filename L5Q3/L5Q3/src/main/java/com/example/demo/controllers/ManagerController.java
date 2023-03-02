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
public class ManagerController {
	

	@Autowired
	EmployeeService es;
	
	@Autowired
	ManagerService ms;
	

	@GetMapping("addManager1") 
	public String addManager1() {
		Manager m = new Manager("M001", "Tom White");
		Employee e1 = new Employee("E001", "John Kelly");
		Employee e2 = new Employee("E002", "Mary Collins");
		
		m.getManagedEmployees().add(e1);
		m.getManagedEmployees().add(e2);
		
		e1.setManager(m);
		e2.setManager(m);

		ms.save(m);
		return "Added Manager 1";
	}

	@GetMapping("getManager1") 
	public String getManager1() {
		Optional<Manager> m =  ms.findById(1);
		return m.get().toString();
	}

	
}
