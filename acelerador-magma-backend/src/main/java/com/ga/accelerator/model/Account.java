package com.ga.accelerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	//@Autowired
	//private Employee lider;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public Account(Long id, String name, Employee lider) {*/
	public Account(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.lider = lider;
	}

	/*public Employee getLider() {
		return lider;
	}

	public void setLider(Employee lider) {
		this.lider = lider;
	}*/

	public Long getId() {
		return id;
	}

	public String getname() {
		return name;
	}

}
