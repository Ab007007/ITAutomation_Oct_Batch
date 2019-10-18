package com.itautomation.training.collections;

import java.util.Date;
import java.util.LinkedList;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add("abcd");
		ll.add(12.5);
		ll.add(true);
		MyUtils.printCollection(ll);
		
		
		
		ll.add(1, new Date().toString());
		MyUtils.printCollection(ll);
		
		ll.remove(0);
		MyUtils.printCollection(ll);
		
	}
}
