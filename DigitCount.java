package com.codegnan.controlstatements;
import java.util.Scanner;
public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scanner.nextInt();
		int count=0;
		if(number==0) {
			count=1;
		}else {
			while(number!=0) {
				number=number/10;
				count=count+1;
			}
		
		}
		System.out.println("Number of Digits:"+count);
		scanner.close();

	}

}
