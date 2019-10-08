package com.itautomation.training.strings;

public class StringsDemo 
{
	public static void main(String[] args)
	{
		//Internally strings are stored as character array
		//Immutable - once created the value can not be changed
		
//		String str  =new String("abc");
//		System.out.println("Before changing the content " + str +  " and the address is " + str.hashCode());
//		str = str.concat("pqr");
//		System.out.println("After changing the content " + str + " and the address is " + str.hashCode());
		String str = "A B C D E C a b c d ";
		
		System.out.println("Character at index 2 is " + str.charAt(2));
		System.out.println("Lengeth of a string " + str.length());
		
		System.out.println("Index of a character/ String 'C'  " + str.indexOf("C"));
		System.out.println("Index of a character/ from a given index 'C'  " + str.indexOf("C",5));
		
		System.out.println("Last index of a character C  "  +str.lastIndexOf("C"));
		System.out.println("Last index of a character C  "  +str.lastIndexOf("C",9));
		
		System.out.println("to lower case " + str.toLowerCase());
		
		System.out.println("to upper case" + str.toUpperCase());
		
		String str1 = "                                a b c d e                           ";
		
		System.out.println("Equals " + str1.equals("a b c d e "));
		System.out.println(" = " + ( str1  == "a b c d e "));
		
		System.out.println("Length with space at the end " + str1.length());
		System.out.println("Length without space at the end " + str1.trim().length());
		
		
		String welcomeMsg = "Hello all goot to see you here, welcome to java , welcome to strings";
		
		String welcomeSubString = welcomeMsg.substring(welcomeMsg.indexOf("welcome"));
		
		String welcomeSubString2 = welcomeMsg.substring(welcomeMsg.indexOf("welcome"), welcomeMsg.lastIndexOf("welcome")-3);
		System.out.println(welcomeSubString);
		System.out.println(welcomeSubString2);
		
		System.out.println("**************************************************************************");
		// split
		String userDetails = "Name=Aravinda;Age=35;Phone=1234567890;Addrss=Bangalore";
		
		String[] details  =  userDetails.split(";");
		
		for (String detail : details) {
//			/System.out.println(detail);
//			Using split function to fetch the values in a String
//			System.out.println(detail.split("=")[1]);
			//Using Substring to fetch the values
			System.out.println(detail.substring(detail.indexOf("=")+1));
			
		
		}
		
		
		
		
		
		
		
		
		
	}

}
