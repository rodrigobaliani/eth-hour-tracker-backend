package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.model.Task;

public interface TaskService {
	
	Task get(Long id);
	List<Task> getAll();
	Task save(Task request);
	Task update(Long id, Task request);
	Task delete(Long id);

}
