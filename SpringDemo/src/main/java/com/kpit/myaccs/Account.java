package com.kpit.myaccs;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("acc")
@Scope("prototype")
public class Account {

	public Account() {
		super();
		System.out.println("Account() ctor..");
	}
	public void withdraw() {
		System.out.println("Withdrawing... amount");
	}
	public void deposit() {
		System.out.println("Depositing... amount");
	}	
}
