package com.model;

public class Account {
      private String pin;
      private String accountNumber;
      private Double balnace;
	  
      private Customer customer;
	  
	 public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalnace() {
		return balnace;
	}
	public void setBalnace(Double balnace) {
		this.balnace = balnace;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	  
	  
	
	
}
