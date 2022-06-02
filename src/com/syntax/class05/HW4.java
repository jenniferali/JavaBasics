package com.syntax.class05;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your current time (military time)");
		int time= scan.nextInt();
		
		if (time>=1&&time<=11) {
			System.out.println("It is morning");
	
		}else if (time>=12&&time<=15) {
			System.out.println("It is the afternoon");
		
		}else if (time>=16&&time<=20) {
			System.out.println("It is the evening");
		
		}else if (time>=21&&time<=24) {
			System.out.println("It is night");
		}
	}

}
