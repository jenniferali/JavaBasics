package com.syntax.class05;

import java.util.Scanner;

public class Task2MayFourteenth {

	public static void main(String[] args) {

		System.out.println("Do you have a credit card?");

		Scanner input = new Scanner(System.in);

		String answer = input.nextLine();

		if (answer.equals("yes")) {

			System.out.println("What is the balance on the card?");

			double balance = input.nextDouble();

			if (balance > 1000) {
				System.out.println("Please pay off the balance immediately.");

			} else if (balance < 1000) {
				System.out.println("You can go ahead and spend more!");
			}

		} else
			System.out.println("We would like to offer you a credit card!");

	}
}
