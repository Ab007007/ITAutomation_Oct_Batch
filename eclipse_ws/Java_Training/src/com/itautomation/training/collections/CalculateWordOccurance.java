package com.itautomation.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CalculateWordOccurance {

	public static void main(String[] args) {
		
		String str = "Hi how are you today , today evening i'm coming with you . i'm going to home town today night Hi how are you going tomorrow";
		
		String[] words = str.split(" ");
		Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
		
		for(String word:words)
		{
			if(mp.get(word)==null)
			{
				mp.put(word, 1);
			}
			else
			{
				mp.put(word,mp.get(word)+1);
			}
		}
		
		
		Iterator<String> it = mp.keySet().iterator();
		String key;
		while(it.hasNext())
		{
			key = it.next();
			System.out.println(key + " : " + mp.get(key));
		}
		
		
		
	}
}
