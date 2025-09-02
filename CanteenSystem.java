package com.codegnan.controlstatements;
import java.util.Scanner;
public class CanteenSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int teaprice=10,coffeeprice=15,samosaprice=20;
		int teaquantity=0,coffeequantity=0,samosaquantity=0;
		int choice;
		double taxrate=0.05;
		do {
			System.out.println("||=======Canteen Menu========||");
			System.out.println("||=======1. View Menu========||");
			System.out.println("||=======2. Order items========||");
			System.out.println("||=======3. View Bill========||");
			System.out.println("||=======4. Checkout and Exit========||");
		System.out.println("Enter Your choice");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("------MENU------");
			System.out.println("1. Tea-$"+teaprice);
			System.out.println("2. Coffee-$"+coffeeprice);
			System.out.println("3. Samosa-$"+samosaprice);
			break;
		case 2:
			System.out.println("Enter item number to order(1-3)");
			int item=scanner.nextInt();
			System.out.println("Enter Quantity");
			int quantity=scanner.nextInt();
			if(quantity<=0) {
				System.out.println("Quantity must be greater than 0");
				break;
			}
			switch(item) {
			case 1:
				teaquantity+=quantity;
				System.out.println(quantity+"Tea(s) Added");
				break;
			case 2:
				coffeequantity+=quantity;
				System.out.println(quantity+"Coffee(s) Added");
				break;
			case 3:
				samosaquantity+=quantity;
				System.out.println(quantity+"Samosa(s) Added");
				break;
				default:
					System.out.println("Invalid Item Number. Please choose between(1-4)");
					break;
			}
			break;
		case 3:
			int teaTotal=teaquantity*teaprice;
			int coffeeTotal=coffeequantity*coffeeprice;
			int samosaTotal=samosaquantity*samosaprice;
			int subTotal=teaTotal+coffeeTotal+samosaTotal;
			double tax=subTotal*taxrate;
			double grandTotal=subTotal+tax;
			System.out.println("-------Bill-------");
			if(teaquantity>0) {
				System.out.println("Tea x"+teaquantity+"=$"+teaTotal);
			}if(coffeequantity>0) {
				System.out.println("Coffee x"+coffeequantity+"=$"+coffeeTotal);
			}if(samosaquantity>0) {
				System.out.println("Samosa x"+samosaquantity+"=$"+samosaTotal);
			}if(subTotal==0) {
				System.out.println("No Items orderd yet");
			}else {
				System.out.println("SubTotal="+subTotal);
				System.out.println("Tax(5%)="+tax);
				System.out.println("GrandTotal="+grandTotal);
			}
			break;
		case 4:
			System.out.println("Thank You!!. Exiting System");
			break;
		default:
			System.out.println("Invalid choice. Please enter a number from(1-4)");
			break;
		}
				
		}while(choice!=4);
		scanner.close();
		
		

	}

}
