package com.ga.accelerator.service;

import java.time.LocalDate;
import java.util.List;

import com.ga.accelerator.model.Employee;
import com.ga.accelerator.model.AssignedHours;

public interface AssignedHoursService {
	
	AssignedHours get(Long id);
	List<AssignedHours> getAll();
	List<AssignedHours> getAllByEmployee(Employee employee);
	List<AssignedHours> getAllByEmployeeInPeriod(Employee employee, LocalDate from, LocalDate to);
	AssignedHours save(AssignedHours request);
	AssignedHours update(Long id, AssignedHours request);
	AssignedHours delete(Long id);

}
