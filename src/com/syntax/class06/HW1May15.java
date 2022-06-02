package com.syntax.class06;

import java.util.Scanner;

public class HW1May15 {

	public static void main(String[] args) {
		// IF STATEMENT//
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country of origin.");
		String country = scan.next();

		if (country.equals("Kazakhstan")) {
			System.out.println("удивительно!You speak Kazakh & Russian");

		} else if (country.equals("Pakistan")) {
			System.out.println("!حیرت انگیز You speak Urdu");

		} else if (country.equals("Turkey")) {
			System.out.println("Harika! You speak Turkish.");

		} else if (country.equals("Afghanistan")) {
			System.out.println("!حیرانونکی You speak Pashto & Dari.");

		} else if (country.equals("Mexico")) {
			System.out.println("¡Increíble! You speak Spanish.");

		} else if (country.equals("Egypt")) {
			System.out.println("!الله You speak Arabic.");

		} else {
			System.out.println("Sorry, that is not a valid entry.");
		}
		// SWITCH //
		String sCountry;
		String language;
		System.out.println("Please enter your country of origin.");
		sCountry = scan.next();

		switch (sCountry) {

		case "Kazakhstan":
			language = "удивительно!You speak Kazakh & Russian";
			break;

		case "Pakistan":
			language = "!حیرت انگیز You speak Urdu";
			break;

		case "Turkey":
			language = "Harika! You speak Turkish.";
			break;

		case "Afghanistan":
			language = "!حیرانونکیYou speak Pashto & Dari.";
			break;

		case "Mexico":
			language = "¡Increíble! You speak Spanish.";
			break;

		case "Egypt":
			language = "!الله You speak Arabic.";
			break;

		default:
			language = "Sorry, that is not a valid entry.";
		}
		System.out.println(language);
	}
}
