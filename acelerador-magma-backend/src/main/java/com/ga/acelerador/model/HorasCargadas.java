package com.ga.acelerador.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class HorasCargadas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Autowired
	private Empleado empleado;
	
	@Autowired
	private Tarea tarea;
	
	private int cantidad;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	
	public HorasCargadas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HorasCargadas(Long id, Empleado empleado, Tarea tarea, int cantidad, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.tarea = tarea;
		this.cantidad = cantidad;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}

	public Long getId() {
		return id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public int getCantidad() {
		return cantidad;
	}

	public LocalDate getFechaDesde() {
		return fechaDesde;
	}

	public LocalDate getFechaHasta() {
		return fechaHasta;
	}
	
	
	
	

}
