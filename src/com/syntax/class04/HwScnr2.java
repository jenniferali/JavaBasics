package com.syntax.class04;

import java.util.Scanner;

public class HwScnr2 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Please enter your lucky number");
		
		
		String luckyNumber =input.next();
		System.out.println(luckyNumber);
		
		System.out.println("Please enter your unlucky number");
		
		String unluckyNumber=input.next();
		System.out.println(unluckyNumber);
		
		System.out.println(" Which number is larger? ");
		String largerNumber =input.next();
		System.out.println(luckyNumber);
		

	}

}
