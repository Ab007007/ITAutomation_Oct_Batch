package com.itautomation.training.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos  = new FileOutputStream(new File("data\\tomyData.txt"),true);
		
		String str =  "Hello Java, i'm from Program!!!!\nExcellent Programming...\n";
		byte[] strArray = str.getBytes();
		fos.write(strArray);
		fos.close();
		System.out.println("wrote "+ str);
	}
}
