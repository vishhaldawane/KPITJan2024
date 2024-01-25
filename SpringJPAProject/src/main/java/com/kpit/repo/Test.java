package com.kpit.repo;

import com.kpit.pojo.Car;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Begin main");

		Car car = new Car();
		car.setCarNumber(123);
		car.setCarName("Maruti");
		car.setCarPrice(100000);
		CarRepository carRepo = new CarRepositoryImpl();
		carRepo.createCar(car);
		
		System.out.println("End main");
	}
}
