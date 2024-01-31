package com.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myEng")
//@Scope("prototype")
public class Engine {

	Engine() {
		System.out.println("Engine() ctor : "+this.hashCode() );
	}
	public void ignite() {
		System.out.println("Igniting");
	}
}
