package com.codegnan.controlstatements;
import java.util.Scanner;
public class AtmExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double balance=60000;
		int pin=1234;//original pin
		System.out.println("Enter your pin:");
		int enterdPin=scanner.nextInt();
		if(enterdPin!=pin) {
			System.out.println("Incorrect Pin. Existing");
			scanner.close();
			return;
		}
		int choice;
		do {
			System.out.println("||================||");
			System.out.println("||========ATM Menu========||");
			System.out.println("||========1. check balance========||");
			System.out.println("||========2. Deposit========||");
			System.out.println("||========3. Withdraw========||");
			System.out.println("||========4. Exit========||");
			System.out.println("||================||");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your Balance is:"+balance);
				break;
			case 2:
				System.out.println("Enter deposit amount:");
				double depositAmount=scanner.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("Please Deposit multiples"+"Hundred like[600,700]");
					
				}else {
					if(depositAmount<500) {
						System.out.println("Please Deposit more than 500 rupees."+"minimum deposit is 500");
						
					}else {
						balance+=depositAmount;
						System.out.println("Deposited $"+depositAmount+"amount sucessfully.new balance is:"+balance);
					}
				}
				break;
			case 3:
				System.out.println("Enter Withdraw Amount:");
				double withdrawAmount=scanner.nextDouble();
				if(withdrawAmount%100!=0) {
					System.out.println("Please Deposit multiples"+"Hundred like[600,700]");
				}else {
					if(withdrawAmount<500) {
						System.out.println("Please Deposit more than 500 rupees."+"minimum deposit is 500");
						
					}else {
						if(withdrawAmount<=balance) {
							balance-=withdrawAmount;
							System.out.println("withdraw $"+withdrawAmount+"amount sucessfully.new balance is:"+balance);
						}else {
							System.out.println("insufficient funds");
						}
					}
				}
				break;
			case 4:
				System.out.println("Exiting...Thank you for using Atm machine");
				break;
				default:
					System.out.println("invalid choice please choose a valid option between 1 to 4");
			}
			
			
		}while(choice!=4);
		scanner.close();

	}

}

