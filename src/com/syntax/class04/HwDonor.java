package com.syntax.class04;

public class HwDonor {

	public static void main(String[] args) {

		int age = 18;

		int weight = 130;

		if (age >= 18) {
			System.out.println("This person's age makes them an eligible donor");

		} else
			System.out.println("This person's age makes them an ineligible donor");

		if (weight >= 110) {
			System.out.println("This person meets the weight requirement to be a donor");

		} else
			System.out.println("This person does not meet the weight requirement to be a donor");
	}

}
