package com.syntax.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * 1. Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 * 2. Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking.
		 */
		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}

			System.out.print(i + " ");
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);

		String answer;

		do {
			System.out.println("Please apply for a credit card.");
			answer = scan.next();

		} while (answer.equals("no"));
		

		scan.close();

	}

}
