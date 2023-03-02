package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository er;
	
	public void save(Employee e) {
		er.save(e);
	}
	
	public Optional<Employee> findById(int eid) {
		return er.findById(eid);
	}

}
