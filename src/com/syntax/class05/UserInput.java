package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name=scan.nextLine();   // capture String [scan.next] is used for only one string
		System.out.println(name);      //[next.Line] caputures more than one String
		
		System.out.println("Please enter age" );
		int age=scan.nextInt(); //capture int
		System.out.println(age);
		
		System.out.println("Please enter price");
		double price=scan.nextDouble(); // capture Double
		System.out.println(price);
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean(); //capture Boolean
		
		
		System.out.println("Please enter any character");
		
		char character=scan.next().charAt(0);  //capture 1 character
		
		System.out.println(character);

	}

}
