package com.ga.acelerador.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Licencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*@Autowired
	private Empleado legajo;
	
	@Autowired
	private Empleado aprobador;*/
	
	private String tipo;
	private String descripcion;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	
	
	
	public Licencia() {

	}

	/*ublic Licencia(Long id, Empleado legajo, Empleado aprobador, String tipo, String descripcion, LocalDate fechaDesde,
			LocalDate fechaHasta) {*/
	public Licencia(Long id, String tipo, String descripcion, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		super();
		this.id = id;
		//this.legajo = legajo;
		//this.aprobador = aprobador;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}

	public Long getId() {
		return id;
	}

	/*public Empleado getLegajo() {
		return legajo;
	}

	public Empleado getAprobador() {
		return aprobador;
	}*/

	public String getTipo() {
		return tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFechaDesde() {
		return fechaDesde;
	}

	public LocalDate getFechaHasta() {
		return fechaHasta;
	}
	
	
	
	

}
