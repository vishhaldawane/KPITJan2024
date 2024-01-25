package com.kpit; //MANDATE

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;

@SpringBootTest //MANDATE
public class CarRepositoryTesting {
	
	@Autowired
	CarRepository carRepo;
	
	@Autowired
	Car carObj;
	

	@Test
	public void createCarTest() {

	//	Car carObj = new Car();
		carObj.setCarNumber(106);
		carObj.setCarName("BMW");
		carObj.setCarPrice(600000);
		carRepo.save(carObj);
	}
}
