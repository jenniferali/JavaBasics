package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);

		System.out.println("Let's calculate the sum of even and odd integers in a range! Enter two numbers please.");
		int int1 = scan.nextInt();
		
		int int2 = scan.nextInt();

		int oddSum = 0;
		
		int evenSum = 0;

		for (int i = int1; i <= int2; i++) {

			if (i % 2 == 0) {
				evenSum += i;
				

			} else {
				oddSum += i;
				
			}
		}
		System.out.println(evenSum+" is the sum of the even numbers!");

		System.out.println(oddSum+" is the sum of the odd numbers!");
		
		scan.close();
	}
}
