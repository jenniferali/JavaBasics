package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		// did you get a job? 
		//we are asking continuously until answer is yes! 
		// once it is yes, CONGRATS!
		
		
		Scanner scan=new Scanner(System.in);
		String job;
		
		do {
			System.out.println("Did you get a job?");
			job= scan.nextLine();
		}while (!job.equalsIgnoreCase("yes"));
		
		System.out.println("Congratulations");
		
		System.out.println("--------------------------");
		
		
		//NEW PROGRAM... BUT WHILE ALONE IS LESS CLEAN
		
		Scanner input= new Scanner(System.in);
		String offer;
		
		System.out.println("Did you get a job?");
		offer=input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job?");
			offer=input.nextLine();	
		}
		System.out.println("Congratulations");
	}

}
