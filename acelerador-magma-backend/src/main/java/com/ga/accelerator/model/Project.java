package com.ga.accelerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	//@Autowired
	//private Account account;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	//public Project(Long id, String name, Account account) {
	public Project(Long id, String name) {//, Account account) {
		super();
		this.id = id;
		this.name = name;
		//this.account = account;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	/*public Account getaccount() {
		return account;
	}*/
	

}