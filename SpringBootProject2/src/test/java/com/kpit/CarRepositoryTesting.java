package com.kpit; //MANDATE

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;

@SpringBootTest // MANDATE
public class CarRepositoryTesting {

	@Autowired
	CarRepository carRepo;

	@Autowired
	Car carObj;

	@Test
	public void createCarTest() {

		// Car carObj = new Car();
		carObj.setCarNumber(108);
		carObj.setCarName("Maruti");
		carObj.setCarPrice(600000);
		carRepo.save(carObj);

	}
	@Test
	public void findCarTest() {
		Car car = null;
		Optional<Car> box = carRepo.findById(106);
		if (box.isPresent()) {
			car = box.get();
		}
		System.out.println(car.getCarName()+" "+car.getCarPrice());
	}
}
