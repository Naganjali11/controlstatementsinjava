package com.codegnan.controlstatements;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scanner.nextInt();
		if(number<0) {
			number=-number;
		}
		int originalnumber=number;
		int reversednumber=0;
		while(number!=0) {
			int remainder=number%10;
			reversednumber=reversednumber*10+remainder;
			number/=10;
		}
		if(originalnumber==reversednumber) {
			System.out.println("It is a Palindrome Number");
		}else {
			System.out.println("It is not a Palindrome Number");
		}
		scanner.close();
		
	}

}
