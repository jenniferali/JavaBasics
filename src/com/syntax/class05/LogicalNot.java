package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * if there is no traffic, i'll get to work on time
		 */
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I'll get to work on time");
		}
		String name="Reza";
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}
	}

}
