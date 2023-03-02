package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String eid;
	private String eName;
	@ManyToOne
	@JoinColumn(name = "manager_FK")
	private Manager manager;
	public Employee() {
		super();
	}
	public Employee(String eid, String eName) {
		super();
		this.eid = eid;
		this.eName = eName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		if (manager == null) {
			return "Employee [id=" + id + ", eid=" + eid + ", eName=" + eName 
					+ ", Manager []"
					+ "]";
		}
		return "Employee [id=" + id + ", eid=" + eid + ", eName=" + eName 
				+ ", Manager [" + manager.getId() + ", " + manager.getMid() + ", " + manager.getmName() + "]"
				+ "]";
	}	
	
}