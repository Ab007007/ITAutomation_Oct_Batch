package com.itautomation.training.strings;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.append("pqr"));
		System.out.println(sb.hashCode());
		
		System.out.println("Reverse of string " + sb.reverse());
		System.out.println("Insert " + sb.insert(0, "XXXXX"));
		System.out.println(sb.delete(0, 5));
		
	}
}
