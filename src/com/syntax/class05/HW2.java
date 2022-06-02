package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your city");
		String city = scan.next();

		System.out.println("Please enter the current temperature");
		int temp = scan.nextInt();

		int celsius = (temp - 32) * 5 / 9;

		System.out.println("The temperature in the city of " + city + " is " + celsius);

	}

}
