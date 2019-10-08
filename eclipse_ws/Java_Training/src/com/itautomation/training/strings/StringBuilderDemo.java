package com.itautomation.training.strings;

public class StringBuilderDemo {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.append("pqr"));
		System.out.println(sb.hashCode());
		
		System.out.println("Reverse of string " + sb.reverse());
		System.out.println("Insert " + sb.insert(0, "XXXXX"));
		//System.out.println(sb.delete(0, 5));
		System.out.println(sb.length());
		System.out.println("capacity " + sb.capacity());
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.lastIndexOf("a"));
		
	}
}
