package com.syntax.class03;

public class IfNoBraces { //AKA THE WRONG THING TO DO!!!

	public static void main(String[] args) {
		/* 
		 * Without braces, java can identify only one statement per block
		 */
		String time="morning";
		
		if (time.equals("morning"))
			
			System.out.println("Say Good Morning");
		
		else
			
			System.out.println("Say Good Day");
		
			System.out.println("Or say good evening");
			
			System.out.println("End of the code");
		
		
			//MUST HAVE THE CURLY BRACES TO COMPLETE IF AND ELSE STATEMENTS!!! 
			
			// THIS PROGRAM is just to teach that lesson! 

	}

}
