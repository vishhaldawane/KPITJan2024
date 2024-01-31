package com.kpit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //its spring's object
@Scope("prototype")
@Entity //plus its JPA's Entity class - object of Car is considered as ROW of the DB
@Table(name="car_tbl") //with table name
public class Car {

	@Id //primary key
	@Column(name="car_id") // column's name
	private int carNumber;
	
	@Column(name="car_model")
	private String carModelName;
	
	@Column(name="car_price")
	private float carPrice;

	public Car() {
		super();
		System.out.println("Car() ctor..."+this.hashCode());
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
	
}
