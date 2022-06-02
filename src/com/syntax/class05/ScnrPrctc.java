package com.syntax.class05;

public class ScnrPrctc {

	public static void main(String[] args) {

		/*
		 * Write a program to find the largest number among three numbers you provided
		 * by a user
		 */

		int num1 = 65;
		int num2 = 66;
		int num3 = 23;

		if (num1 >= num2) {

			if (num1 >= num2) {
				System.out.println(num1 + " is largest number");
			} else {
				System.out.println(num3 + " is largest number");
			}

		} else { // "Otherwise" if num2>num1

			if (num2 >= num3) {
				System.out.println(num2 + " is the largest number");
			} else { // num3>num2
				System.out.println(num3 + " is the largest number");
			}
		}

	}

}