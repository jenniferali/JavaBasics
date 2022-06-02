package com.syntax.class07;

public class Task01 {

	public static void main(String[] args) {
		
		// even numbers 20 to 100
		int num= 20;
		while (num<=100) {
			System.out.print(num+" ");
			num+= 2;
		}
		System.out.println();
		
		// 100 to 1 odd numbers
		int num2= 100;
		while (num2>=1) {
			if  (num2 % 2 !=0) {
			System.out.print(num2+" ");
			}
			num2--;
		}
		// another way 
		
		System.out.println();
		int num3= 99;
		while (num3>=1) {
			System.out.print(num3+" ");
			num3-=2;
		}
	}

}
