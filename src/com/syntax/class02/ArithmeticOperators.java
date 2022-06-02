package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[]args) {
		
		int num1= 40;
		int num2= 20;
		
		int sum, sub, mult, div;
		
		System.out.println(num1/num2);//2
		
		sum=num1+num2; 
		System.out.println(sum);//60
		
		sub=num1-num2; 
		System.out.println(sub);//20
		
		mult=num1*num2; 
		System.out.println(mult);//800
		
		div=num1/num2;
		System.out.println(div);//2
		
		double num3=9.99;
		double num4=3.50;
		double sum1, sub1, mult1, div1; 
		
		sum1=num3+num4; 
		
		int a= 10;
		int b= 3;
		
		int result= a/b;			// result would be 3 because int has no decimals, should be 3.33
		System.out.println(result);	// result would be 3 because int has no decimals
		
		double c=10.0;
		double d=3.0; // now we are using double to calculate numbers with decimals
		
		double result2= c/d;
		System.out.println(result2);// now we are using double to calculate numbers with decimals
		// it will work, and result is 3.33333
		
		float e=10.0f;
		float f=3.0f;
		
		float result3=e/f;
		System.out.println(result3);
		 
		//Remember that double has more decimal places than float!!!
		//Thats why float's print line has less decimals. 
		
		
		
		
		
	}
}
