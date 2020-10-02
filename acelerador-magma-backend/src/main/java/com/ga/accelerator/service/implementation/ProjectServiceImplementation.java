package com.ga.accelerator.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.Project;
import com.ga.accelerator.repository.ProjectRepository;
import com.ga.accelerator.service.ProjectService;

@Service
public class ProjectServiceImplementation implements ProjectService {
	
	@Autowired
	private ProjectRepository repository;

	@Override
	public Project get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project save(Project request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project update(Long id, Project request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
