package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		/*
		 * switch has data type limits
		 * works with byte, short, int, char, String
		 * DOES NOT with double, float, long, boolean
		 */

		double price=10;
		
		//*switch(price) {      compiler error CE:cannot switch double
		
		
		boolean hungry=true;
		
		// switch(hungry)
		
		// cannot switch on a value of type boolean
		
		// switch also has operator limits 
		
		// cannot use logical operator inside switch || && if, else if, else
		
		// cannot use relational >= == <= 
		
	}

}
