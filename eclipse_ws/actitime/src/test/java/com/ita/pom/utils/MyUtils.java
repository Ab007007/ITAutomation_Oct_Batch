package com.ita.pom.utils;

import java.util.Date;

public class MyUtils {

	
	public static String getCurrentDateAndTime() {
		Date d = new Date();

		String date = d.toString();

		date = date.replace(" ", "_").replace(":", "_");
		
		return date;
	}
}
