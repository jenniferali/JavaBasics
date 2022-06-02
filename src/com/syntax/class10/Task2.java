package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		//Create an array to store char values 
		//and then print those in reverse order
		
		char[] sweets = {'S', 'T', 'R', 'E', 'S', 'S', 'E', 'D'};
		
		for (int i = sweets.length-1; i >= 0; i-- ) {
			
			System.out.print(sweets[i]+" ");
		}
	}

}
// IF PRINTING IN REVERSE, DO NOT USE FOR LOOP ENHANCED