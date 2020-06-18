package com.ga.acelerador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Autowired
	private Cuenta cuenta;

	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proyecto(Long id, String nombre, Cuenta cuenta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public Long getId() {
		return id;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
	

}