package com.syntax.class10;

public class AnotherWay2DArray {

	public static void main(String[] args) {
		
		// create a 2D array of states
		
		/*
		 * 1st array -> NY -> all cities of NY
		 * 2nd array -> CA -> all cities of CA
		 * 3rd array -> FL -> all cities of FL
		 * 4th array -> VA -> all cities of VA
		 */

		String [][] usa = {
				{"New York", "Albany", "Buffalo"},
				
				{"LA", "San Francisco", "San Jose", "Sand Diego",},
				
				{"Miami", "Orlando", "Niceville", "Tampa" },
				
				{"McLean", "Richmond", "Leesburg"},
		};
		
		System.out.println(usa [1][2]);  //San Jose
		System.out.println(usa [2][0]);  //Miami
		
		System.out.println("Total # of 1D arrays in USA ="+usa.length); //4
		
		int elem1array = usa[0].length;
		
		System.out.println("# of elements in 1st array ="+elem1array);
		
		int elem2array = usa[1].length;
		
		System.out.println("# of elements in 2nd array ="+elem2array);
		
		
		
		
		
		
	}

}
