package com.codegnan.controlstatements;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=scanner.nextInt();
		int digits=0;
		int result=0;
		int originalnumber=number;
		int countnumber=number;
		while(countnumber!=0) {
			countnumber/=10;
			digits++;
		}
		while(originalnumber!=0) {
			int remainder=originalnumber%10;
			result += Math.pow(remainder, digits);
            originalnumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        scanner.close();
		}

	}


