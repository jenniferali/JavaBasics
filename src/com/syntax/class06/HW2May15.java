package com.syntax.class06;

import java.util.Scanner;

public class HW2May15 {

	public static void main(String[] args) {
		// IF STATEMENT//
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your letter grade.");
		String grade = scan.next();

		if (grade.equals("A")) {
			System.out.println("You have entered " + grade + ". Excellent!");

		} else if (grade.equals("B")) {
			System.out.println("You have entered " + grade + ". Good!");

		} else if (grade.equals("C")) {
			System.out.println("You have entered " + grade + ". Average...");

		} else if (grade.equals("D")) {
			System.out.println("You have entered " + grade + ". Bad...");

		} else {
			System.out.println("Hmmm. Not acceptable!");
		}
		// SWITCH
		String sGrade;
		String result;
		System.out.println("Please enter your letter grade.");
		sGrade = scan.next();

		switch (sGrade) {

		case "A":
			result = " Excellent!";
			break;
		case "B":
			result = " Good!";
			break;
		case "C":
			result = " Average...";
			break;
		case "D":
			result = " Bad...";
			break;
		default:
			result = " Hmmm. Not acceptable!";
		}
		System.out.println("You have entered " + sGrade + "." + result);
	}
}
