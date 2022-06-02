package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * declare a secret number; 
		 * 
		 * you want to ask user to guess your secret number
		 * 
		 * your code should keep asking to guess until user gets your secret number
		 */
		
		int sNum= 13;
		 
		 int gNum;
		
		 Scanner scan=new Scanner(System.in);
		  
		 do {
			 System.out.println("Guess my secret number...");
			 gNum= scan.nextInt();

		 }while (gNum!=sNum);
		 
		 System.out.println("You guessed it!");
			 
		 scan.close();
		 }

	}


