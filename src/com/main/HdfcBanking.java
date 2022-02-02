package com.main;

import java.util.Scanner;

import com.service.BankService;
import com.service.BankServiceImpl;
import com.utils.ScannerUtility;

public class HdfcBanking {

	public static void main(String[] args) {
		
		BankService b=new BankServiceImpl();
		Scanner sc=ScannerUtility.getScanner();
		
		while (true){
			System.err.println("Welcome To HDFC:");
			System.out.println("1}Create Account");
			System.out.println("2}Withdraw Amount");
			System.out.println("3}Deposite");
			System.out.println("4}View Account");
			System.out.println("5}Exit");
			
			System.out.println("Enter Above Option");
			int option=sc.nextInt();
			
			switch (option) {
			case 1:
				    b.createAccount();
				break;
			case 2:
				b.withdraw();
				break;
			case 3:
				b.diposite();
				break;
			case 4 :
				b.display();
				break;
			case 5:
				System.err.println("Thank you!!!");
				System.exit(0);
				break;

			default:
				System.err.println("Wrong Input");
				
				break;
			}
			
			
			
		}
		
		
		
	}

}
