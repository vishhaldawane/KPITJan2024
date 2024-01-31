package com.kpit.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Scope("prototype")
@Entity
@Table(name="car_tbl2")
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
		System.out.println("Car() .....");
		// TODO Auto-generated constructor stub
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


