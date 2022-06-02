package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		char [] grade = {'A', 'B', 'C', 'D'};
		
		for (int i=0; i<grade.length; i++) {
			
			System.out.print(grade[i]+" ");
		}
		System.out.println("--------------------");
		
		String[] words = {"Java", "Saturday", "day", "coding", "is"};
		
		// I want to retrieve all elements 
		
		for (int i=0; i<words.length; i++) {
			
			System.out.print(words[i]+" ");
		}
	}

}
