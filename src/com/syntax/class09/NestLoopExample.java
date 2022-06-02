package com.syntax.class09;

public class NestLoopExample {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {			//THIS CODE WILL BE PRINTED LIKE 5 x 3.... 
		
			System.out.println("Hello"); 
			
			for (int y = 1; y <= 3; y++) {
				
				System.out.println("Bye");
		
			}
			System.out.println();
		}

		//for (int i = 1; i <= 5; i--) {			//THE OUTER LOOPS CONTROLS THE # OF ITERATIONS... 
												// INFINITE OUTER LOOP... THIS CODE WILL RUN INFINITELY 5 x 3
			//System.out.println("Hello"); 
			
			//for (int y = 1; y <= 3; y++) {
				
				//System.out.println("Bye");
			
		
		for (int j = 1; j <= 5; j++) {			//OUTER LOOP 1 TIME "HELLO"
			
			System.out.println("Hello");
			
		//for (int k = 1; k <= 3; k--) {			//INNER LOOP INFINITE
		
		//System.out.println("Bye");
//}
		}
		
for (int l = 1; l <= 5; l++) {			
			
			System.out.println("Hello");		//ONE TIME HELLO
			
		for (int m = 1; m <= 3; m++) {			//3 TIMES BYE
		
		System.out.println("Bye");
		}
		break;	
		
		
	}
		for (int p = 1; p <= 5; p++) {					//HELLO 5 TIMES
	
				System.out.println("Hello");		
	
					for (int q = 1; q <= 3; q++) {			

							System.out.println("Bye");
			
						break;							// BREAKS INNER LOOP ONLY
					}
		
		
		
		}}}
