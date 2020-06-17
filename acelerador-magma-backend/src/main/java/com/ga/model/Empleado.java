package com.ga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String legajo;
	private String mail;
	private String nombre;
	private String rol;
	private String cargaHoraria;
	
	public Empleado() {
	
	}

	public Empleado(Long id, String legajo, String mail, String nombre, String rol, String cargaHoraria) {
		super();
		this.id = id;
		this.legajo = legajo;
		this.mail = mail;
		this.nombre = nombre;
		this.rol = rol;
		this.cargaHoraria = cargaHoraria;
	}

	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getLegajo() {
		return legajo;
	}
	
	public String getMail() {
		return mail;
	}
	
	public String getNombre() {
		return nombre;
	}
	

}
