package com.syntax.class04;

public class Task3MayEighth {

	public static void main(String[] args) {
		/*
		 * Write a program to store a value whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a gpa score. 
		 * If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, 
		 * otherwise → “You should have studied harder” .
		 */
		
		boolean hasDiploma= true;
		
		double gpa;
		
		if(hasDiploma) {
			System.out.println("Congratulations");
			gpa=3.0;
			
			if (gpa>3.5) {
				System.out.println("You are eligible for a scholarship");
			}else if (gpa<3.5) {
				System.out.println("You should have studied harder");
			}
			
			}else {
				System.out.println("I suggest you get a degree");
			
		}
		
		
		
		
		

	}

}
