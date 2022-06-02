package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number

		int[] numbers = {10, 20, 30, 40, 50};

		int lNumber = numbers[0];

		for (int i=1; i < numbers.length; i++) {
			
			if(numbers[i]>lNumber)
			{
				lNumber= numbers[i];
			}
		}
		System.out.println("The largest number is "+lNumber);

		
		}
	}


