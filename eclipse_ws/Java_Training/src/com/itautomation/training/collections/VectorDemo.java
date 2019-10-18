package com.itautomation.training.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		//List al = new ArrayList();
		
		Vector v = new Vector();
		v.add(10);
		v.add("abcd");
		v.add("person OBJ");
		v.add(10);
		v.add("abcd");
		v.add("person OBJ");
		MyUtils.printCollection(v);

		System.out.println("Inserting element at 0 th index");
		v.add(0, "NewElement_" + new Date().toString());
		MyUtils.printCollection(v);

		System.out.println("remove the element at last index");
		v.remove(0);
		MyUtils.printCollection(v);

		System.out.println("replace the element value at 1 index");
		v.add(1, "XYZ");
		v.remove(2);
		MyUtils.printCollection(v);

		MyUtils.printCollectionUsingForEach(v);

		MyUtils.printUsingIterator(v);
	}
}
