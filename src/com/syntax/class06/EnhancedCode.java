package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter your quiz, midterm and final exam scores");
		
		int qscore=scan.nextInt();
		int mscore=scan.nextInt();
		int fscore=scan.nextInt();
		
		int ascore=((qscore+mscore+fscore)/3);
		char grade;
		
		if (ascore>=90) {
			grade='A';
	
		}else if (ascore>=70&&ascore<90) {
			grade='B';
		
		}else if (ascore>=50&&ascore<70) {
			grade='C';
		
		}else {
			grade='F';
		}
		System.out.println("You are a "+grade+" student");
		
		if (grade=='A'||grade=='B') {
			System.out.println("You are doing great!");
			
		}else {
			System.out.println("Please try to study more...");
		}
	}

}
