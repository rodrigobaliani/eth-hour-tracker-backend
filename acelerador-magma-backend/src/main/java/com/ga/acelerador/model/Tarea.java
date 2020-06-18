package com.ga.acelerador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Autowired
	private Proyecto proyecto;

	public Tarea() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarea(Long id, String nombre, Proyecto proyecto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.proyecto = proyecto;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}
	
	

}
