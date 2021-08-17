package com.localization;

import java.util.Locale;
import java.util.ResourceBundle;
// packageQualifier.bundleName+"_"+language+"_"+country+"_"+(variant+"_#" "#")+script+"-"+extension
// message_hi_IN_ka.properties
// searching Order for the ResurceBundle
// step 1: The search starts by looking for an exact match for the resourceBundle with the full name.
/* step 2: The last component (the part separated by underscore)is drop and search is repeated with 
the resulting shorter name , this process is repeated till the last locale modifier is left.*/
// step 3: The search is continued using the full name of the bundle for the default locale.
// step 4: search for the ResourceBundle with just the name of the bundle.
// step 5: the search fail,throwing a missing bundle exception.
//e.g : message_language_country_variant
// message_language_country
// message_language
//  message_defaultLanguage_defaultCountry
// message_defaultLanguage
//  message
//  exception

public class LocalizedMessage {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("message");
		String msg = rb.getString("welcome");
		System.out.println(msg);

	}

}
