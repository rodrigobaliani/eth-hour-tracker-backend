package com.ga.accelerator.service.implementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.Employee;
import com.ga.accelerator.model.AssignedHours;
import com.ga.accelerator.repository.AssignedHoursRepository;
import com.ga.accelerator.service.AssignedHoursService;

@Service
public class AssignedHoursServiceImplementation implements AssignedHoursService {
	
	@Autowired
	private AssignedHoursRepository repository;

	@Override
	public AssignedHours get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AssignedHours> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AssignedHours> getAllByEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AssignedHours> getAllByEmployeeInPeriod(Employee employee, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignedHours save(AssignedHours request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignedHours update(Long id, AssignedHours request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignedHours delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
