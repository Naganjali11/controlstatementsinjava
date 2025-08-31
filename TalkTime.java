package com.codegnan.controlstatements;
import java.util.Scanner;
public class TalkTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your talktime:");
		int talktime=scanner.nextInt();
		if(talktime<100) {
			System.out.println("Basic plan");
		}else {
			if(talktime>=100&&talktime<300) {
				System.out.println("Standard plan");
			}else {
				if(talktime>=300&&talktime<500) {
					System.out.println("premium plan");
				}else {
					if(talktime>=500) {
						System.out.println("unlimited plan");
					}else {
						System.out.println("talktime doesnot exist");
					}
				}
			}
		}
		scanner.close();
	}

}
