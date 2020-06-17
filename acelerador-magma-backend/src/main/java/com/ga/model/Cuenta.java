package com.ga.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Autowired
	private Empleado lider;

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuenta(Long id, String nombre, Empleado lider) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lider = lider;
	}

	public Empleado getLider() {
		return lider;
	}

	public void setLider(Empleado lider) {
		this.lider = lider;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

}
