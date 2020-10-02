package com.ga.accelerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String file;
	private String mail;
	private String name;
	private String role;
	private String workload;
	
	public Employee() {
	
	}

	public Employee(Long id, String file, String mail, String name, String role, String workload) {
		super();
		this.id = id;
		this.file = file;
		this.mail = mail;
		this.name = name;
		this.role = role;
		this.workload = workload;
	}

	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getWorkload() {
		return workload;
	}
	
	public void setWorkload(String workload) {
		this.workload = workload;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getFile() {
		return file;
	}
	
	public String getMail() {
		return mail;
	}
	
	public String getName() {
		return name;
	}
	

}
