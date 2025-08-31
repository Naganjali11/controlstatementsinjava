package com.codegnan.controlstatements;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=scanner.nextInt();
		if (marks>=90) {
			System.out.println("Grade : o");
		}else {
			if(marks>=80) {
				System.out.println("Grade : S");
			}else {
				if(marks>=70) {
					System.out.println("Grade : A");
				}else {
					if(marks>=60) {
						System.out.println("Grade : B");
					}else {
						if (marks>=50) {
							System.out.println("Grade : C");
						}else {
							if (marks>=35) {
								System.out.println("Grade : D");
							}else {
								System.out.println("Grade : F");
							}
						}
					}
				}
			}
		}
		scanner.close();
	}
}
