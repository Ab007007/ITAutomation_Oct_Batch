package com.itautomation.training.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProperteisReader {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data\\userdetails.properties");
		FileReader fr  =  new FileReader(file);
		Properties props = new Properties();
		props.load(fr);
		
		System.out.println(props.getProperty("name"));
		System.out.println(props.getProperty("age"));
		System.out.println(props.getProperty("height"));
		
		fr.close();
	}
}
