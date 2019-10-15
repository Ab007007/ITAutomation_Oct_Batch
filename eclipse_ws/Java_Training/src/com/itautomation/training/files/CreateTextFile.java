package com.itautomation.training.files;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {

	private static String location = "data";
	public static void main(String[] args) throws IOException 
	{
//		createUserFile("tomyData");
		File file  = new File(location);
		
		String[] files = file.list();
		
		for (String fileName : files)
		{
			System.out.println(fileName);
		}
		

	}

	public static void printFileInfo(File file) {
		System.out.println("check file exist or not " + file.exists());
		System.out.println("Absolute path of a file " + file.getAbsolutePath());
		System.out.println("Total number of files present in a folder " + file.list().length);
		System.out.println("Total number of files present in a folder " + file.listFiles());

	}

	public static void createUserFile(String fileName) {
		File file = new File("data\\" + fileName + ".txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Created new file");
		} else {
			System.out.println("File already exist!!!");
		}
	}
}
