package com.syntax.class05;

import java.util.Scanner;

public class Task1MayFourteenth {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What is your age?" );
		int age=scan.nextInt(); //capture int
		
		if (age>18) {
			System.out.println("You will be issued a driver's license.");
		} else {
			System.out.println("You will be issued a learner's permit");
		}
	}

}
