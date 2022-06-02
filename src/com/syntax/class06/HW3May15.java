package com.syntax.class06;

import java.util.Scanner;

public class HW3May15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// IF STATEMENT//
		System.out.println("Welcome to calculator. Please enter the 1st number in your math problem.");
		int num1 = scan.nextInt();

		System.out.println("Please enter the 2nd number in your math problem.");
		int num2 = scan.nextInt();

		System.out.println("Please enter your operator and choose from +, -, *, or /");
		String operator = scan.next();

		if (operator.equals("+")) {
			System.out.println("Your solution is " + (num1 + num2));

		} else if (operator.equals("-")) {
			System.out.println("Your solution is " + (num1 - num2));

		} else if (operator.equals("*")) {
			System.out.println("Your solution is " + (num1 * num2));

		} else if (operator.equals("/")) {
			System.out.println("Your solution is " + (num1 / num2));

		} else {
			System.out.println("Sorry, not a valid equation.");
		}
	//SWITCH//
		int sNum1;
		int sNum2;
		int solution;
		String sOperator;
		
		System.out.println("Welcome to calculator. Please enter the 1st number in your math problem.");
		sNum1 = scan.nextInt();

		System.out.println("Please enter the 2nd number in your math problem.");
		sNum2 = scan.nextInt();

		System.out.println("Please enter your operator and choose from +, -, *, or /");
		sOperator = scan.next();
		
		switch(sOperator) {
		
		case "+":
			solution=(sNum1+sNum2);
			break;
		case "-":
			solution=(sNum1-sNum2);
			break;
		case "*":
			solution=(sNum1*sNum2);
		case "/":
			solution=(sNum1/sNum2);
			break;
		default:
			solution= 0;	
		}
		System.out.println("Your solution is "+solution);	
			
		}
	}


