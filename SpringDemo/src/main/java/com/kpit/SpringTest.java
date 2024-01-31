package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kpit.myaccs.Account;

public class SpringTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		System.out.println("==>Creating application context...");
			ApplicationContext ctx = new ClassPathXmlApplicationContext("myspring.xml");
		System.out.println("=>ApplicationContext created....");

		Account accObj = (Account) ctx.getBean("acc");
		accObj.withdraw();
		accObj.deposit();
		
		HotelReception reception = (HotelReception) ctx.getBean("hotelRec");
		reception.checkRooms();
		reception.billing();
		
		HotelRoom room1 = (HotelRoom) ctx.getBean("hotelRm");
		HotelRoom room2 = (HotelRoom) ctx.getBean("hotelRm");
		HotelRoom room3 = (HotelRoom) ctx.getBean("hotelRm");
		
		room1.enjoyTelevision();
		room2.enjoyTelevision();
		room3.enjoyTelevision();
		
		System.out.println("reception : "+reception.hashCode());
		System.out.println("room1 : "+room1.hashCode());
		System.out.println("room1 : "+room2.hashCode());
		System.out.println("room1 : "+room3.hashCode());
		
		
		System.out.println("End main");
	}
}
