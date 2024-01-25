package com.kpit; //MANDATE

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;
import com.kpit.service.CarService;

@SpringBootTest //MANDATE
public class CarServiceTesting {
	
	@Autowired
	CarService carService;
	
	@Autowired
	Car carObj;
	

	@Test
	public void createCarServiceTest() {

	//	Car carObj = new Car();
		carObj.setCarNumber(107);
		carObj.setCarName("Audi");
		carObj.setCarPrice(600000);
		carService.createNewCarService(carObj);
	}
}
