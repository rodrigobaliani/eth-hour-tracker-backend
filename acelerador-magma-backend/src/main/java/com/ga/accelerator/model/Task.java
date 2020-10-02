package com.ga.accelerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	/*@Autowired
	private Project Projecto;*/

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Task(Long id, String name, Project Projecto) {
	public Task(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.Projecto = Projecto;
	}

	public Long getId() {
		return id;
	}

	public String getname() {
		return name;
	}

	/*public Project getProjecto() {
		return Projecto;
	}*/
}
