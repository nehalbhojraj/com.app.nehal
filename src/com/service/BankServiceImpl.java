package com.service;

import java.util.Scanner;

import com.model.Account;
import com.model.Customer;
import com.utils.ScannerUtility;

public class BankServiceImpl implements BankService {
   Customer customer=null;
   Account account=null;
	
	
	@Override
	public void createAccount() {
	 Scanner sc=ScannerUtility.getScanner();
	  
	 customer=new Customer();
	 System.out.println("Please Enter Name");
	 customer.setName(sc.next());
	 System.out.println("Please Enter MobileNubmer");
	 customer.setMobile(sc.next());
	 
	 account =new Account();
	 System.out.println("Enter pin");
	 account.setPin(sc.next());
	 System.out.println("Enter Account Number");
	 account.setAccountNumber(sc.next());
	 System.out.println("Enter Account Balance");
	 account.setBalnace(sc.nextDouble());
		
		account.setCustomer(customer);
		customer.setAccount(account);
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void withdraw() {
		Scanner sc=ScannerUtility.getScanner();
		if(customer !=null) {
			System.out.println("Enter Pin");
			String userPin=sc.next();
			if(customer.getAccount().getPin().equals(userPin)){
			
				System.out.println("Enter Withdraw Amount");
				Double userAmt=sc.nextDouble();
				if(userAmt>0) {
					Double bal=customer.getAccount().getBalnace()-userAmt;
					customer.getAccount().setBalnace(bal);
					System.out.println("Withdrawn Amount::"+userAmt);
					System.out.println("Account Balance::"+bal);
					
				}else System.out.println("please Enter Valid Amount");
				
			}else System.err.println("Wrong Pin");
			
		}else System.err.println("No Customer Found");
		
		
	}

	@Override
	public void diposite() {
		Scanner sc=ScannerUtility.getScanner();
				
		if(customer!=null) {
			System.out.println("Enter Pin");
			String userPin=sc.next();
			if(customer.getAccount().getPin().equals(userPin)) {
				System.out.println("Enter Amount Do You Want To Diposite");
				Double userAmt=sc.nextDouble();
				if(userAmt>0) {
					Double bal=customer.getAccount().getBalnace()+userAmt;
					customer.getAccount().setBalnace(bal);
					System.out.println("Deposite Amount::"+userAmt);
					System.out.println("Account Balance::"+bal);
				
				}else System.err.println("please Enter Valid Amount");
				
			}else System.err.println("Wrong Pin");
			
			
		}else System.err.println("No Customer Found");
		
		
	}

	@Override
	public void display() {
		if(customer!=null) {
			System.err.println("Account Details of Customer");
			System.out.println("Name:"+account.getCustomer().getName()+"|"+
		                 "Mobile NO:"+account.getCustomer().getMobile()+"|"+
				   "Account Number:"+customer.getAccount().getAccountNumber()+"|"+
		                 "Balance:"+customer.getAccount().getBalnace() );
			
			
			
		}else System.err.println("No Customer Found");
		
		
		
	}

}
