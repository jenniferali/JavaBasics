package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		
		String month=scan.next();
		
		String season;
		
		if (month.equals("March")||month.equals("April")||month.equals("May")) {
			season="Spring";
			
		}else if (month.equals("June")||month.equals("July")||month.equals("August")) {
			season="Summer";
			
		}else if (month.equals("September")||month.equals("October")||month.equals("November")) {
			season="autumn";
			
		}else if (month.equals("December")||month.equals("January")||month.equals("February")) {
			season="winter";
			
		}else {
			season="invalid";
		}
		
		if (!season.equals("invalid")){
		System.out.println("You were born in "+season);
	}

}
}