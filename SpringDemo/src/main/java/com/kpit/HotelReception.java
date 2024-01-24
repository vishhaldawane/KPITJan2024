package com.kpit;

import org.springframework.stereotype.Component;

@Component("hotelRec")
public class HotelReception {
	public HotelReception() {
		System.out.println("HotelReception() ctor..."+this.hashCode());
	}	
	void checkRooms() {
		System.out.println("checking the availability of the rooms...");
	}
	void billing() {
		System.out.println("Billing the customers...");
	}
}
