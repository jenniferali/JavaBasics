package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// To create 2D arrays we must specify number of rows and columns
		
		int [][] numbers = new int [3][4];
		
		// 1st row
		numbers [0][0] = 10; 
		numbers [0][1] = 20;
		numbers [0][2] = 30;
		numbers [0][3] = 40;

		// 2nd row
		numbers [1][0] = 1; 
		numbers [1][1] = 2;
		numbers [1][2] = 3;
		numbers [1][3] = 4;
		
		// 3rd row0
		numbers [2][0] = 9; 
		numbers [2][1] = 8;
		numbers [2][2] = 7;
		numbers [2][3] = 6;
		
		System.out.println(numbers[1][3]); //4
		
		System.out.println(numbers[0][1]); //20
		
		int rows = numbers.length;
		System.out.println("Number of rows = "+rows); //tells us how may rows there are
		
		int colfirstrow = numbers[0].length;
		System.out.println("Number of columns in 1st row ="+colfirstrow);
	}

}
