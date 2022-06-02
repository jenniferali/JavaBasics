package com.syntax.class05;

import java.util.Scanner;

public class Task5MayFourteenth {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 1000");
		int num= input.nextInt();
		
		if (num>=1&&num<=10) {
			System.out.println("Your number is small");
	
		}else if (num>=11&&num<=100) {
			System.out.println("Your number is medium");
		
		}else if (num>=101&&num<=1000) {
			System.out.println("Your number is large");
		}

	}

}
