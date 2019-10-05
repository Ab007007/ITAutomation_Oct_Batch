package com.itautomation.training.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int marks[] = new int[6];
		
		String[] names = {"abc","def","pqr"};
		
		marks[0] = 35;
		marks[1] = 55;
		marks[2] = 65;
		marks[3] = 75;
		marks[4] = 85;
		marks[5] = 95;
		
		
		System.out.println(marks[4]); // marks[0], marks[1], marks[2]......
		System.out.println(names[0]);
		
		System.out.println("Length of an marks array " + marks.length);
		System.out.println("Length of an names array " + names.length);
	}

}
