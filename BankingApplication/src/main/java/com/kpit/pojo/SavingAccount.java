package com.kpit.pojo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component // Mandate
@Entity // Mandate
@Table(name = "saving_tbl") // if skip class name will be table name
public class SavingAccount {
	
	

	public SavingAccount() {
		super();
		System.out.println("SavingAccount contructor ready.....");
		// TODO Auto-generated constructor stub
	}

	@Id // Mandate
	@Column(name = "acc_no") // if skip column name will be below field name
	private int accountNumber;

	@Column(name = "acc_name")
	private String accountHolder;

	@Column(name = "acc_bal")
	private float accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}

	
}
