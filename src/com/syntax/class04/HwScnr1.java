package com.syntax.class04;

import java.util.Scanner;

public class HwScnr1 {

	public static void main(String[] args) {
		
		
				Scanner input= new Scanner(System.in);
				
				
				System.out.println("Please enter user first name");
				
				
				String firstName=input.next();
				System.out.println(firstName);
				
				System.out.println("Please enter user last name");
				
				String lastName=input.next();
				System.out.println(lastName);
				
				System.out.println(firstName+" "+lastName+" , please enter your US state of residence ");
				
				String state=input.next();
				
				System.out.println(firstName+" "+lastName+" lives in "+state);
				
	}

}
