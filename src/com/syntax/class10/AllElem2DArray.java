package com.syntax.class10;

public class AllElem2DArray {

	public static void main(String[] args) {
	
		String [][] usa = {
				{"New York", "Albany", "Buffalo"},
				
				{"LA", "San Francisco", "San Jose", "Sand Diego", "Redding"},
				
				{"Miami", "Orlando", "Niceville", "Tampa" },
				
				{"McLean", "Richmond", "Leesburg"},
		};
		
		//outer loop iterates over rows
		//inner loop iterates over columns
		
		for(int row = 0; row<usa.length; row++) {
			
			for (int col = 0; col<usa[row].length; col++) {
				
				System.out.println(usa[row][col]);
			}
		}
		
			for (String[] us:usa) {
				
				for (String u:us) {
					
					System.out.print(u+" ");
				}
				System.out.println();
			}
		
		
		
		
	}

	

}
