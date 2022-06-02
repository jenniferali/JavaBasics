package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// Create an array to store double values
		// and then print all elements using 2 different loops

		double[] numbers = { 99.99, 89.99, 79.99, 69.99 };

		for (int i = 0; i < numbers.length; i++) {		//INDEX (i) CONTROLLED

			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		System.out.println("-----------------------");

		for (double num : numbers) {					//VARIABLE CONTROLLED

			System.out.print(num + " ");

		}
	}
}
