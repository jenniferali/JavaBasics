package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
		/*
		 * declare 2 numbers and verify which one is the largest
		 * test each variable for if it is true, you can switch the values of variables
		 * test your code by providing different values
		 */
		
		int num1= 20;
		int num2= 20;
		
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if (num2>num1){
			System.out.println(num2+" is larger than "+num1);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		System.out.println("---------------------------------------------------------------");
		/*
		 * The moment Java finds a true condition
		 * it executes that block and exits entire if statement 
		 */
		
		int day= 9;
	
		if (day==1) {
		System.out.println("Monday");
		}else if(day==2){
		System.out.println("Tuesday");
		}else if(day==3){
		System.out.println("Wednesday");
		}else if(day==4){
		System.out.println("Thursday");
		}else if(day==5){
		System.out.println("Friday");
		}else if(day==6){
		System.out.println("Saturday");
		}else if(day==7){
		System.out.println("Sunday");
		}
	}

}
