package com.codegnan.controlstatements;
import java.util.Scanner;
public class AirPlaneTicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double baseprice=5000.0;
		double finalprice=baseprice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Passenger type(Child/Senior/adult):");
		String passengerType=scanner.next();
		if(passengerType.equalsIgnoreCase("child")) {
			finalprice=finalprice*0.5;
		}else {
			if(passengerType.equalsIgnoreCase("senior")) {
				finalprice=finalprice*0.8;
			}else {
				if(passengerType.equalsIgnoreCase("Adult")) {
					System.out.println("No Discount For Adults");
				}else {
					System.out.println("Invalid Passenger Type");
					scanner.close();
					return;
				}
			}
		}
		System.out.println("Enter the Booking Time(early/normal/lastminute):");
		String bookingtime=scanner.next();
		if(bookingtime.equalsIgnoreCase("early")) {
			finalprice=finalprice*0.9;
		}else {
			if(bookingtime.equalsIgnoreCase("normal")) {
				System.out.println("No Discount on Normal Booking");
			}else {
				if(bookingtime.equalsIgnoreCase("lastminute")) {
					finalprice=finalprice*1.2;
				}else {
					System.out.println("Invalid booking time");
					scanner.close();
					return;
				}
			}
		}
		System.out.println("Is the passenger a member?(Yes/No)");
		String membership=scanner.next();
		if(membership.equalsIgnoreCase("yes")) {
			finalprice=finalprice*0.95;
		}else {
			if(membership.equalsIgnoreCase("no")) {
				System.out.println("No discount");
			}else {
				System.out.println("invalid membership");
				scanner.close();
				return;
			}
		}
		System.out.println("Final Ticket Price:"+finalprice);
		scanner.close();
	}

}
