package com.codegnan.controlstatements;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to print: ");
        int count = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series:");

        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();


	}

}
