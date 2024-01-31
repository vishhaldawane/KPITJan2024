package com.kpit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpit.pojo.SavingAccount;

public interface SavingAccountRepo extends JpaRepository<SavingAccount, Integer> {
	
}
