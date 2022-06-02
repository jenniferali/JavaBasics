package com.syntax.class02;

public class WaysToCreateVariables {

	public static void main(String[] args) {
		
		// FIRST WAY to create/declare a variable, we need 2 things:datatype (int) 
		//and name (temperature) and assign/ initialize value (60)
		/* So: 
		 * datatype=int 
		 * name= temperature
		 * value= 60
		 */
		int temperature =60;
		
		/* SECOND WAY (2 steps), WHEN VALUE IS UNKNOWN
		 * create a variable (datatype and name)
		 * assign the value
		 */

		int sum; //create the variable, you may not know the value...
		sum=30; //assign the value when you know it later
		sum=50; //reassign the value
		
		System.out.println(sum);	
		
		int num1, num2, num3; // create 3 variables of int type
		num1=10;	//assign the value
		num2=20;	//assign the value 
		num3=30;	//assign the value	
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//ADDING ALL THREE num
		System.out.println (num1 + num2 + num3);
		
		
	}

}
