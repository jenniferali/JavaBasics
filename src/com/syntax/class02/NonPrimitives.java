package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		// All non primitives should start with an upper case letter
		//quotes help the string be read by java
		
		String name="Jennifer";

		String lastName="Ali";
		
		long phone=1234567890l; 
		
		
		//xxx-xxx-xxxx What if we want this layout? STRING!
		
		String phoneNumber= "123-456-7890";
		
		// address? STRING!
		
		String address= "123 Washington St";
		
		
	
		
		
		int age=30; 
		String city="Miami";
		
		
		// syso+ctrl+space is a shortcut for:
		System.out.println();
		
		/* When we want to attached String to String (CONCATENATION)
		 * we can use + to attach them
		 */
		
		System.out.println(name+lastName); //prints as "JenniferAli", we need a space! 
		
		System.out.println(name+" "+lastName);// Prints correctly as "Jennifer Ali"
		
		
		
		//Jennifer lives in Miami
		// in Java, + =concatenation
		System.out.println(name+" lives in "+city);
		
		
		
		//Jennifer is 30 years old
		System.out.println(name+" is "+age+" years old ");
		
		/* 
		 * Rules for identifiers
		 * 1. No Spaces
		 * 2. No Keywords
		 * 3. Cannot start with numbers (but can be used after variable name)
		 * 4. Cannot use special characters except _ or $
		 */
		

		/* 
		 * Naming Conventions
		 * 1. Follow camel casing (start with a lowercase letter and then follow camel casing) 
		 * 2. Class names should start with uppercase letters
		 */
		
		String mycity="Tysons";	//NOT CORRECT, USE CAMEL CASING
		String myCity="Tysons"; //CORRECT! lowercase first, uppercase second
		
		
		
		
		
	}
	

}
