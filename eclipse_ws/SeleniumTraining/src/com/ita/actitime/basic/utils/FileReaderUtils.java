package com.ita.actitime.basic.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtils 
{

	
	public static String getMyPropertyValue(String key) throws IOException
	{
		System.out.println("Reading properties file for the key " + key);
		String text = null;
		File file = new File("data\\globaldata.properties");
		FileReader fr  =  new FileReader(file);
		Properties props = new Properties();
		props.load(fr);
		
		//return props.getProperty(key)!=null?props.getProperty(key):"no key found";
		if(props.getProperty(key) != null)
		{
			text =  props.getProperty(key);
		}
		else
		{
			text =   "no key found in properties file";
		}
	
		System.out.println("Got value from properties file " + text);
		return text;
	}
}
