package com.localization;

import java.util.Arrays;

import java.util.Locale;

public class Localization {
	public static void printContentByLocale(String country) {
		switch (country) {
		case "IN": {
			System.out.println("Namaste");
			break;
		}
		case "US": {
			System.out.println("Hello");
			break;
		}
		case "JA": {
			System.out.println("Mihir");
			break;
		}
		default: {
			System.out.println("hi");
		}

		}

	}

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		/*
		 * System.out.println(locale.getDisplayCountry());
		 * System.out.println(locale.getISO3Language());
		 */
		// Q. how many ways we can create an Object of Locale.
		// 1. using constructor.
		Locale locale1 = new Locale("fr");
		// WAY 2
		Locale locale2 = Locale.CANADA;
		// WAY 3
		Locale locale3 = Locale.getDefault();
		// WAY 4
		Locale locale4 = new Locale.Builder().setLanguage("it").build();
		// WAY 5
		Locale locale5 = Locale.forLanguageTag("ja");
		Locale[] availableLocales = Locale.getAvailableLocales();
		// Arrays.stream(availableLocales).forEach(l->System.out.println(l.getLanguage()+"
		// "+l.getDisplayLanguage()+" "+l.getCountry()+" "+l.getDisplayCountry()));
		printContentByLocale("JA");
	}

}
