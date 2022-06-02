package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
		int i=100;
		
		double d=100;
		
		System.out.println(i);//100
		System.out.println(d);//
		
		long l=10000;
		
		//byte b=130;
		
		//type mismatch cannot convert double to int, so add parenthesis (int)
		//int x= 99.99	
		
		int x=(int)99.99; 
				
		System.out.println(x);		
		
		//type mismatch: cannot convert from int to byte
		//byte b= 130; 
		
		byte b=(byte)130;
		
		System.out.println(b);
		
		float f=10.99f;
		
		double dd=9.99;
		
		double price=100;
		
		
	}
		
	
}
