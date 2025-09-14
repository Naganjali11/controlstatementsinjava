package com.codegnan.controlstatements;
import java.util.Scanner;
public class CalorieCaluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input: meal choice
	        System.out.print("Enter your meal choice (salad/sandwich/pasta): ");
	        String meal = sc.nextLine().toLowerCase();

	        // Input: Add cheese?
	        System.out.print("Do you want to add cheese? (true/false): ");
	        boolean addCheese = sc.nextBoolean();

	        // Input: Add meat?
	        System.out.print("Do you want to add meat? (true/false): ");
	        boolean addMeat = sc.nextBoolean();

	        int calories = 0;

	        // Base calories for meal
	        if (meal.equals("salad")) {
	            calories += 150;
	        } else if (meal.equals("sandwich")) {
	            calories += 300;
	        } else if (meal.equals("pasta")) {
	            calories += 400;
	        } else {
	            System.out.println("Invalid meal choice.");
	            sc.close();
	            return;
	        }

	        // Add-ons
	        if (addCheese) {
	            calories += 100;
	        }
	        if (addMeat) {
	            calories += 150;
	        }

	        System.out.println("Estimated total calories: " + calories);
	        sc.close();

	}

}

