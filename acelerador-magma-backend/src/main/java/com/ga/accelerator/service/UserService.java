package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.model.User;

public interface UserService {
	
	User get(Long id);
	List<User> getAll();
	User save(User request);
	User update(Long id, User request);
	boolean delete(Long id);
}
