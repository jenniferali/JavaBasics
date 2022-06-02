package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		// Create an array on integers
		// and calculate the sum of all elements in an array

		int[] array = { 2, 4, 6, 8, 10 };

		int sum = 0;

		for (int i : array) {
			sum += i;
		}
		System.out.println(sum + " is the sum of this array!");


		}
	}


