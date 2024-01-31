package com.kpit; //MANDATE

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;
import com.kpit.service.CarService;
import com.kpit.service.myexception.CarAlreadyException;

@SpringBootTest //MANDATE
public class CarServiceTesting {
	
	@Autowired
	CarService carService;
	
	@Autowired
	Car carObj;
	

	@Test
	public void createCarServiceTest() {

		Car carObj = new Car();
		carObj.setCarNumber(109);
		carObj.setCarName("Kia");
		carObj.setCarPrice(600000);
		try {
			carService.createNewCarService(carObj);
		} catch (CarAlreadyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
