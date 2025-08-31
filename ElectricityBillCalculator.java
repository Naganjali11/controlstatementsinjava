package com.codegnan.controlstatements;
import java.util.Scanner;
public class ElectricityBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of units consumed:");
		int units=scanner.nextInt();
		double bill=0;
		if(units<=100) {
			bill=units*1.5;
		}else {
			if(units<=200) {
				bill=100*1.5+(units-100)*2.0;
			}else {
				if(units<=300) {
					bill=100*1.5+100*2.0+(units-200)*3.0;
				}else {
					bill=100*1.5+100*2.0+100*3.0+(units-300)*5.0;
				}
			}
		}
		if(bill>1000) {
			bill=bill*bill*0.10;
		}
		System.out.println("Is this user a senior citizen(Yes/No)");
		String seniorinput=scanner.next();
		if(seniorinput.equalsIgnoreCase("Yes")) {
			bill=bill-bill*0.05;
		}
		System.out.println("Total Elecitricity Bill is:"+bill);
		scanner.close();
	}

}
