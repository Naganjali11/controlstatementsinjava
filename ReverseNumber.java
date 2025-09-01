package com.codegnan.controlstatements;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		if(number<0) {
			number=-number;
		}
		int originalNumber=number;
		int reversednumber=0;
		while(number!=0){
			int remainder=number%10;
			reversednumber=reversednumber*10+remainder;
			number/=10;
		}
		System.out.println("Reverse of a Number:"+originalNumber+"is:"+reversednumber);
		scanner.close();
	}

}
