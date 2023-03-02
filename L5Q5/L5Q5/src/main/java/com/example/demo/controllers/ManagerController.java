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
	

	@GetMapping("delManager1")
	public String delManager1() {
		Optional<Manager> e = ms.findById(1);
		ms.delete(e.get());
		return "Deleted Manager 1";
	}
}
