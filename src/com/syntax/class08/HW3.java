package com.syntax.class08;

import java.text.DecimalFormat;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an
		 * hour and 2 digits for a minute.
		 */
		DecimalFormat formatter = new DecimalFormat("00");

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {

				{
					System.out.println(formatter.format(h) + ":" + formatter.format(m));
				}
			}
		}

	}
}
