package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCar")
//@Scope("prototype")
public class Car {

	@Autowired
	Engine theEngine; //hasA
	
	//@Autowired
	//EntityManager em;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Car() ctor..."+this.hashCode());
		
	}


	public void startTheCar() {
		System.out.println("Starting the car...");
		if(theEngine!=null) {
			System.out.println("theEgnine : "+theEngine.hashCode());
			theEngine.ignite();
		}
		else {
			System.out.println("Engine not yet initialized...");
		}
	}
}
