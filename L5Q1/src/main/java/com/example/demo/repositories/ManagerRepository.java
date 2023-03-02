package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Integer> {

}
