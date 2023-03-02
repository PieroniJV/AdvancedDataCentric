package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Module;

@RestController
public class ModuleController {
	
	@GetMapping(path = "addModules")
	public String addModules() {
		return null;
	}
}
