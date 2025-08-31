package com.codegnan.controlstatements;
import java.util.Scanner;
public class WelcomeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your City name:");
		String city=scanner.next();
		if(city.equalsIgnoreCase("hyderabad")) {
			System.out.println("Hello Hyderabadi....Adab");
		}else {
			if(city.equalsIgnoreCase("banglore")) {
				System.out.println("Hello Kannadiga....yee sala cup namdu");
		}else {
			if(city.equalsIgnoreCase("chennai")) {
				System.out.println("Hello Madrasi....Vannakam");
			}else {
				System.out.println("Enter a valid city name");
			}
		}
	}
	scanner.close();
	}
}

