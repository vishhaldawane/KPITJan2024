package com.kpit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="car_tbl")
public class Car {
	
	@Id
	@Column(name="car_no")
	private int carNumber;
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="car_price")
	private float carPrice;

	public Car() {
		super();
		System.out.println("Car() ctor...");
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
	
}
