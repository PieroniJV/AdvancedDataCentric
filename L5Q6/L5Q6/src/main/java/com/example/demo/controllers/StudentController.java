package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Module;
import com.example.demo.models.Student;

@RestController
public class StudentController {
	
	@GetMapping(path = "addG001")
	public String addG001() {
		return null;
	}
	
	@GetMapping(path = "addG002")
	public String addG002() {
		return null;
	}
	
	@GetMapping(path = "getG002")
	public String getG002() {
		return null;
	}

}
