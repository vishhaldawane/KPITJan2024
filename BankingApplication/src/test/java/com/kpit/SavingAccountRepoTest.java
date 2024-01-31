package com.kpit;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.kpit.pojo.SavingAccount;
import com.kpit.repo.SavingAccountRepo;

@SpringBootTest
public class SavingAccountRepoTest {

	@Autowired
	SavingAccountRepo savingRepo;

	@Test
	public void insertTest() {
		SavingAccount sav = new SavingAccount();
		// order doesn't matter
		sav.setAccountNumber(102);
		sav.setAccountHolder("Prakhar");
		sav.setAccountBalance(10000000);

		savingRepo.save(sav);
	}

	@Test
	public void updateTest() {
		SavingAccount sav = new SavingAccount();
		// order doesn't matter
		sav.setAccountNumber(102);
		sav.setAccountHolder("PRAKHAR");
		sav.setAccountBalance(90000000);

		savingRepo.save(sav);
	}

	@Test
	public void deleteTest() {
		SavingAccount sav1;
		SavingAccount sav;
		// order doesn't matter
		Optional<SavingAccount> box = savingRepo.findById(101);
		if (box.isPresent()) {
			sav = box.get();
			savingRepo.delete(sav);
		}
	}

	@Test
	public void selectAllTest() {

		List<SavingAccount> list = null;
		// order doesn't matter
		list = savingRepo.findAll();
		
		for (SavingAccount savingAccount : list) {
			System.out.println(savingAccount);
			
		}
	}

}
