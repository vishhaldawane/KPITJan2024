package com.kpit.service;

import org.springframework.stereotype.Service;

import com.kpit.pojo.Car;
import com.kpit.service.myexception.CarAlreadyException;

@Service
public interface CarService  {

	void createNewCarService (Car car) throws CarAlreadyException;
}
