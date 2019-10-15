package com.itautomation.training.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo 
{
	public static void main(String[] args) throws IOException 
	{
		
		File file = new File("data\\myFirstTextFile.txt");
		FileReader fr  = new FileReader(file);
		BufferedReader br  =  new BufferedReader(fr);
		
//		BufferedReader br1 = new BufferedReader(new FileReader(new File("data\\myfirstTextFile.txt")));
	
		
		String line;
		while((line= br.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}
