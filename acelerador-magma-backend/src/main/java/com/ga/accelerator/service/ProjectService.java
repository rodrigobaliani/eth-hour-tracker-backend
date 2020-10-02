package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.model.Project;

public interface ProjectService {
	
	Project get(Long id);
	List<Project> getAll();
	Project save(Project request);
	Project update(Long id, Project request);
	Project delete(Long id);

}
