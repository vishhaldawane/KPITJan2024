package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ChainingTest {
	public static void main(String[] args) {
		//SavingsAccount saObj = new SavingsAccount();
		//saObj.withdraw(5000);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("carsConfig.xml");
		D d = ctx.getBean(D.class); //get the bean by its type
		d.foo();
	}
}
class SavingsAccount
{
	float balance;
	void withdraw(float amt) {
		System.out.println("SavingsAccount : withdraw() ...");
		balance = balance - amt;
	}
}
class SavingsRepository
{
	SavingsAccount savRef;
	
	SavingsRepository(SavingsAccount x) {
		savRef = x;
	}
	void withdraw(float amt) {
		System.out.println("SavingsRepository : withdraw");
		//...
		savRef.withdraw(amt); //SavingsAccount's withdraw
		//..
	}
}





@Component
class A{ //Account
	void foo() { //withdraw
		System.out.println("\t\t\tA:foo()...actual pojo...the real business of withdraw");
	}
}

@Component
class B{
	@Autowired
	A a;
	void foo() {
		System.out.println("\t\tB:foo()..checking jpa repos...");
		//otp
		//grid
		//password
		//trans
		a.foo();
		//trans close
		//relase security
		System.out.println("\t\tB:foo()..checking jpa repos...");

	}
}

@Component
class C {
	@Autowired
	B b;
	void foo() {
		System.out.println("\tC:foo() ..services started...");
		b.foo();
		System.out.println("\tC:foo() ..service over.......");

	}
}

@Component
class D {
	@Autowired
	C c;
	void foo() {
		System.out.println("D:foo()..Controller..started");
		c.foo();
		System.out.println("D:foo()..Controller..over...");
	}
}












