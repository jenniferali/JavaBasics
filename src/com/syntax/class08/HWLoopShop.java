package com.syntax.class08;

import java.util.Scanner;

public class HWLoopShop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the item you want to purchase.");
		String item =scan.next();
		
		System.out.println("Please enter the price of the item.");
		double price= scan.nextDouble();
		
		double paid= 0;
		
		while(paid<price) {
			
			System.out.println("You have a balance, please make a payment.");
			double payment= scan.nextDouble();
			
			paid+=payment;
			
			if (paid==price) {
				System.out.println("You have zero balance. Thank you for shopping!");
				
			} else if (paid>price) {
				double difference = paid-price;
				System.out.println("You have overpaid. The difference returned to you is $"+difference);
				
			}
		}	
	}
}
