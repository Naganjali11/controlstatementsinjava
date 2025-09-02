package com.codegnan.controlstatements;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		long number=scanner.nextLong();
		long sum=0;
		while(number>0) {
			long digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("Sum of the Given Number is:"+sum);
		scanner.close();
	}

}
