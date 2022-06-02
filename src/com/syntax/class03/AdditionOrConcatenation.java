package com.syntax.class03;

public class AdditionOrConcatenation {
	public static void main(String[] args) {
		
	int a= 10;
	int b= 20;
	
	String c="Hello";
	String d="Hi";
	
	System.out.println(a+b+c+d);//30HelloHi
	System.out.println(a+c+b+d);//10Hello20Hi
	System.out.println(c+d+a+b);//???..
	
	//because a String is next to an integer, the print is showing HelloHi1020
	
	
	//What about using parenthesis?
	
	System.out.println(c+d+(a+b)); //now it comes out as HelloHi30
	
	boolean boo= true;
	
	System.out.println(c+boo);
	
	}

}
