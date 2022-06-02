package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			
			System.out.println(i); //outer loop controls inner loop
			
			for (int y=1; y<=2; y++) {
				
				System.out.println(y); // inner loop depends on the outer loop
			}
		}
		
	System.out.println("___________________________________________________");
	
	for (int i=1; i<=3; i++) {
		for (int y=1; y<=2; y++) {
			System.out.println(i+" "+y);
		}
	}
	System.out.println("___________________________________________________");
	
	for (int i=1; i<=3; i++) {
		System.out.println("Hello");
	
		for (int y=1; y>=2; y++) {
			System.out.println("Bye");
	
}
}
	System.out.println("___________________________________________________");
	
	for (int i=1; i>3; i--) {			//outer loop will never execute because i will never be greater than 3
		System.out.println("Hello");
		
		for(int y=1; y<=2; y++) {
			System.out.println("Bye");
		}
	}
	
	
	
	}}
