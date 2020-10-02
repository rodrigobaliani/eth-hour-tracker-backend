package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.model.Account;

public interface AccountService {
	
	Account get(Long id);
	List<Account> getAll();
	Account save(Account request);
	Account update(Long id);
	Account delete(Long id);
}
