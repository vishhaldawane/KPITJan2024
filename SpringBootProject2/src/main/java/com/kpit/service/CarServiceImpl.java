package com.kpit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;
import com.kpit.service.myexception.CarAlreadyException;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepo;

	@Override
	public void createNewCarService(Car car) throws CarAlreadyException {
		// TODO Auto-generated method stub
		Car x = null;
		Optional<Car> box = carRepo.findById(car.getCarNumber());
		if (box.isPresent()) {
			x = box.get();
			throw new CarAlreadyException("This Car Alreday Exists");
		} else {
			carRepo.save(car); // tell the repo to save the object
		}

	}

}
/*
 * A - pojo B - Repo C - Service D - Controller
 * 
 */