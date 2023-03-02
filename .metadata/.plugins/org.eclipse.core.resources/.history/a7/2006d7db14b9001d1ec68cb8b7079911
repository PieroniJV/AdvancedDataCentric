package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String mid;
	private String mName;
	@OneToMany(mappedBy = "manager")
	private List<Employee> managedEmployees = new ArrayList<Employee>();
	public Manager() {
		super();
	}
	public Manager(String mid, String mName) {
		super();
		this.mid = mid;
		this.mName = mName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public List<Employee> getManagedEmployees() {
		return managedEmployees;
	}
	public void setManagedEmployees(ArrayList<Employee> managedEmployees) {
		this.managedEmployees = managedEmployees;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", mid=" + mid + ", mName=" + mName + ", managedEmployees=" + managedEmployees
				+ "]";
	}
	
}
