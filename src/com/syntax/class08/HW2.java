package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int charge = 0;
		int balance = 0;
		int difference = 0;
		int payment = 0;

		System.out.println("Please enter the item you'd like to purchase.");
		String item = scan.next();

		System.out.println("Please enter the price of the item.");
		int price = scan.nextInt();

		System.out.println("Please submit payment.");
		
		
		do {
			charge = scan.nextInt();
			payment += charge;
			balance = price - payment;

			if (payment > price) {
				difference = payment - price;
				System.out.println("You have over-paid the balance and are owed the difference of $" + (difference) + ".");
				break;

			} else if (payment == price) {
				System.out.println("No balance remaining. Thank you for shopping!");
				break;
			}

			System.out.println("You have a balance remaining of $" + balance + ". Please submit payment.");
		} while (payment < price);

		scan.close();
	}
}
