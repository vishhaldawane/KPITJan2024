package com.kpit.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kpit.pojo.Car;

@Repository // below interface is responsible for CRUD operation
public interface CarRepository { //CarDAO
	void createCar(Car car);
	void updateCar(Car car);
	void deleteCar(int carid);
	Car  readCar(int id);
	List<Car> readCars();
}
