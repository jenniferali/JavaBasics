package com.syntax.class05;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter your quiz, midterm and final exam scores");
		
		int qscore=scan.nextInt();
		int mscore=scan.nextInt();
		int fscore=scan.nextInt();
		
		int ascore=((qscore+mscore+fscore)/3);
		
		if (ascore>=90) {
		System.out.println("Grade = A");
	
		}else if (ascore>=70&&ascore<90) {
			System.out.println("Grade = B");
		
		}else if (ascore>=50&&ascore<70) {
			System.out.println("Grade = C");
		
		}else if (ascore<50) {
			System.out.println("Grade = F");
		}
	}
}
