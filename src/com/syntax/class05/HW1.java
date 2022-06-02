package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter loan amount needed");
	
		int loan=scan.nextInt();
		
		if (loan<=200000) {
			System.out.println("You've been granted approval for a loan");
		
		}else {
			System.out.println("Sorry, your request has been rejected");
		}
			
		
		

	}

}
