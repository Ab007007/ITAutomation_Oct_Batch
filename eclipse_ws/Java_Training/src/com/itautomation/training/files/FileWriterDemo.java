package com.itautomation.training.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data\\tomyData.txt"),true));
		
		bw.newLine();
		bw.write("i'm from File writer");
		bw.newLine();
		bw.close();
		
	}
	

}
