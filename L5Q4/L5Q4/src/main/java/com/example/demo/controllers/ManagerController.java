package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.models.Manager;
import com.example.demo.services.ManagerService;

@RestController
public class ManagerController {
	@Autowired
	ManagerService ms;

	@GetMapping("getManager1")
	public String getManager() {
		Optional<Manager> m = ms.findById(1);
		return m.get().toString();
	}

}
