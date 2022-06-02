package com.syntax.class09;

public class MoreNestedLoopExamples {

	public static void main(String[] args) {
		// HOW TO CREATE A MULTIPLICATION TABLE
		
		for (int x = 1; x <= 10; x++) {
			
			for (int y = 1; y <=10; y++) {
				
				System.out.println(x + "x" + y +"="+ x*y);
			}
			System.out.println("----------------------------"); //THIS IS PRINTED BECAUSE ITS INSIDE THE FOR LOOP
		}

	}

}
