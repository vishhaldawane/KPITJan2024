package com.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kpit.myaccs.Account;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		System.out.println("==>Creating application context...");
			ApplicationContext ctx = new ClassPathXmlApplicationContext("carsConfig.xml");
		System.out.println("=>ApplicationContext created....");

		Car car = (Car) ctx.getBean("myCar");
		car.startTheCar();
	
		//Car car = new Car();
		//car.theEngine = new Engine();
		//car.startTheCar();
		
		System.out.println("End main");
	}
}
