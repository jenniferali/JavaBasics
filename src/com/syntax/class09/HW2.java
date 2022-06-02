package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String [] cuteNature = {"pupper", "monkey", "otter", "bunny", "pygmy hippo"};
		
		for (int i=0; i<cuteNature.length; i++)
			
			System.out.print(cuteNature[i]+" ");
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		for (String cuties:cuteNature)
			
			System.out.print(cuties+" ");
	}

}
