package com.ga.accelerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.accelerator.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public boolean existsByMail(String mail);

}
