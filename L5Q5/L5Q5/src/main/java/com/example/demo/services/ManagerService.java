package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Manager;
import com.example.demo.repositories.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	ManagerRepository mr;
	
	public void save(Manager m) {
		mr.save(m);
	}
	
	public Optional<Manager> findById(int id) {
		return mr.findById(id);
	}
	
	public void delete(Manager m) {
		mr.delete(m);
	}

}
