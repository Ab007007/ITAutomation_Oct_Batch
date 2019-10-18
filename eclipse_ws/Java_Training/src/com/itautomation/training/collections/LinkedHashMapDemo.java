package com.itautomation.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map mp = new LinkedHashMap();
		mp.put("name", "aravinda");
		mp.put("age", "35");
		mp.put("address", "Bangalore");

		printMapValues(mp);
		
		mp.put("name", "XYZ");
		mp.put("age", "3500");
		mp.put("address", "XYYYXXYYYX");
		
		printMapValues(mp);
		
		
//		
//		
//		
//		System.out.println("Using entry set...");
//		Set entrySetValues =  mp.entrySet();
//		
//		Iterator it1 = entrySetValues.iterator();
//		while(it1.hasNext())
//		{
//			System.out.println(it1.next());
//		}
//				

		
		
		
	}

	private static void printMapValues(Map mp) {
		System.out.println("Size of map - " + mp.size());
		Set keys = mp.keySet();

		Iterator it = keys.iterator();
		Object key=null;
		while (it.hasNext()) {
			key  = it.next();
			System.out.println("Key : "  + key + " and value is " + mp.get(key)) ;
		}
	}

}
