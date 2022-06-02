package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		
		//to create a variable (box): data type and name required, 
		
		// "box 1" is the "variable" name, byte is data type
		
		// WHOLE NUMBERS
		
		byte box1= 127;
		short box2= 2022;	
		int box3=76666;
		long box4= 4567890876543L;	
				
		// DECIMAL VALUES
		
		//float 5-6 decimal places
		
		//double 14-15 places
		
		float container=1.99f; 
		
		double container2=89.99; 
		
		// to represent ONE CHARACTER, (char)
		
		char gender='m';
		char dollar='$';
		
		// to represent TRUE or FALSE (yes or no)
		
		boolean hungry=true;
		boolean sleepy=false; 
		
		//how to access values from variables? 
		// do not use double quotes to access (run) variables,
		//they already have an assigned name
		//access and print values from all variables
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(container);
		System.out.println(container2);
		System.out.println(gender);
		System.out.println(dollar);
		System.out.println(hungry);
		System.out.println(sleepy);
		
	}

}
