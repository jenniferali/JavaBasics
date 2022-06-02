package com.syntax.class02;

public class Variable {

	public static void main(String[] args) {
		
		String name= "Jennifer";
		String lastName= "Ali";
		
		char student='A';
		
		String city= "Dallas";
		String state= "Texas"; 
		
		String phoneNumber= "123-456-7890";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		
		System.out.println("I am an "+student+" student ");
		
		System.out.println("I live in "+city+" "+state);
		
		System.out.println("And my phone number is "+phoneNumber);
		
		student='C';
		city= "Manhattan";
		state= "New York"; 
		phoneNumber= "333-333-3333";
		
		
		System.out.println("I am now a "+student+" student ");
		
		System.out.println("I moved to "+city+" "+state);
		
		System.out.println("And my new phone number is "+phoneNumber);
		
		
	}

}
