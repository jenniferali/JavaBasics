package com.syntax.class10;

public class RecapArrays {

	public static void main(String[] args) {
		
		String[] disney = {"Elsa","Shrek", "Goofy", "Mulan", "Tom & Jerry"};
				
				System.out.println(disney[1]); //Elsa
				
				System.out.println("All elements using regular for loop-----");
		
		// to get all elements from an array
		
		 for (int i=0; i < disney.length; i++ ) {
			 System.out.print(disney[i]+" ");
			 
			 if (disney[i].equalsIgnoreCase("Shrek")) {
				 System.out.print(disney[i]+" is my favorite character");
			 }else {
				 
				 System.out.println(disney[i]);
			 }
		 }
		 System.out.println();
		 System.out.println("All elements using regular for loop-----");
		 
		 for (String character:disney) {
			 
			 if (character.equalsIgnoreCase ("Mulan")) {
				continue;
			 
			 }else {
			 System.out.print(character+" ");
		 }
	}

	}}
