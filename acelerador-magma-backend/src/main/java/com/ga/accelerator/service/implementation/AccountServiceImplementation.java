package com.ga.accelerator.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.Account;
import com.ga.accelerator.repository.AccountRepository;
import com.ga.accelerator.service.AccountService;

@Service
public class AccountServiceImplementation implements AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	@Override
	public Account get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account save(Account request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
