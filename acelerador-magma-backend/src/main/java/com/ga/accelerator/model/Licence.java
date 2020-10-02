package com.ga.accelerator.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Licence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*@Autowired
	private Employee file;
	
	@Autowired
	private Employee aprobador;*/
	
	private String type;
	private String description;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	
	
	
	public Licence() {

	}

	/*ublic Licence(Long id, Employee file, Employee aprobador, String type, String description, LocalDate dateFrom,
			LocalDate dateTo) {*/
	public Licence(Long id, String type, String description, LocalDate dateFrom,
			LocalDate dateTo) {
		super();
		this.id = id;
		//this.file = file;
		//this.aprobador = aprobador;
		this.type = type;
		this.description = description;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public Long getId() {
		return id;
	}

	/*public Employee getfile() {
		return file;
	}

	public Employee getAprobador() {
		return aprobador;
	}*/

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}
}
