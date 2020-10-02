package com.ga.accelerator.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.Task;
import com.ga.accelerator.repository.TaskRepository;
import com.ga.accelerator.service.TaskService;

@Service
public class TaskServiceImplementation implements TaskService {
	
	@Autowired
	private TaskRepository repository;

	@Override
	public Task get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task save(Task request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task update(Long id, Task request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
