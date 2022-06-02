package com.syntax.class09;

public class EnhancedLoop {

	public static void main(String[] args) {
		
		//Enhanced/Advanced for loop (for each)
// CAN ONLY BE USED ONLY WHEN WE WORK WITH ARRAY OR COLLECTIONS
		
		String [] colors = {"pink", "blue", "white", "black"};
		
		for (String color:colors) {
			
			System.out.println(color+" ");
		}
		System.out.println();
		
		int [] numbers= {10, 20, 30, 40};
		
		for (int num:numbers) {
			
			System.out.println(num);
		}
		
	}

}
