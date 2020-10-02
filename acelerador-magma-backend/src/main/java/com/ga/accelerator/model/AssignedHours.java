package com.ga.accelerator.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class AssignedHours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Autowired
	//private Employee employee;
	
	//@Autowired
	//private Task tarea;
	
	private int quantity;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	
	public AssignedHours() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public AssignedHours(Long id, Employee employee, Task tarea, int quantity, LocalDate dateFrom,
			LocalDate dateTo) {*/
	public AssignedHours(Long id, int quantity, LocalDate dateFrom,
			LocalDate dateTo) {
		super();
		this.id = id;
		//this.employee = employee;
		//this.tarea = tarea;
		this.quantity = quantity;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public Long getId() {
		return id;
	}

	/*public Employee getemployee() {
		return employee;
	}

	public Task getTarea() {
		return tarea;
	}*/

	public int getQuantity() {
		return quantity;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}
}
	