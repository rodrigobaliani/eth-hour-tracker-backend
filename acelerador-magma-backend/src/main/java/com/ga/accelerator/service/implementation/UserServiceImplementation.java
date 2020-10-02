package com.ga.accelerator.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.User;
import com.ga.accelerator.repository.UserRepository;
import com.ga.accelerator.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(Long id, User request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
