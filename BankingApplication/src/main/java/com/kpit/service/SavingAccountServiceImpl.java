package com.kpit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.pojo.SavingAccount;
import com.kpit.repo.SavingAccountRepo;


@Service
public class SavingAccountServiceImpl implements SavingAccountService {
	
	@Autowired
	SavingAccountRepo savingRepo;
	
	@Override
	public void createService(SavingAccount sav) {
		// TODO Auto-generated method stub
		
		// we write our business logic here	
		
		System.out.println("Doing Some business logic 1");
		
		savingRepo.save(sav);
		
		System.out.println("Doing Some business logic 2");
		// we write our business logic here
		

	}

	@Override
	public void updateService(SavingAccount sav) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteService(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public SavingAccount selectService(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SavingAccount> selectAllService() {
		// TODO Auto-generated method stub
		return null;
	}

}
