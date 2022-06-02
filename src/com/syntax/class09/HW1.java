package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		String [] cars = {"Audi", "BMW", "Cadillac", "DeLorean", "Etud", "Ferrari"};
		
		for (int i=0; i<cars.length; i++)
			
			System.out.print(cars[i]+" ");
		
		System.out.println();
		System.out.println("---------------------------------------");
		
		for (String car:cars)
			
			System.out.print(car+" ");
	}

}
