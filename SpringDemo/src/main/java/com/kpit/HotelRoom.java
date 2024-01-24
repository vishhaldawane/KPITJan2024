package com.kpit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hotelRm")
@Scope("prototype")
public class HotelRoom {
	public HotelRoom() {
		System.out.println("HotelRoom() ctor..."+this.hashCode());
	}
	void enjoyTelevision() {
		System.out.println("Enjoying tv...");
	}
}
