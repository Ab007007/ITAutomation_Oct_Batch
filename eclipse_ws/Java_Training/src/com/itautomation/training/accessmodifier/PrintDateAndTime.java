package com.itautomation.training.accessmodifier;

import java.util.Date;

public class PrintDateAndTime {

	public static void main(String[] args) {
		
		Date d  = new Date();
		
		
		String date = d.toString();
		
		date = date.replace(" ", "_").replace(":", "_");
		
		System.out.println(date);
		
		
	}
}
