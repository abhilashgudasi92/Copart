package Copart;

import java.util.Scanner;

public class stringtoInteger {
	
	//Function to covert the given input string to integer
	public static int stringToInteger(String str) {
	    int convert = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        convert += (str.charAt(i) - '0') * factor;
	        factor *= 10;
	    }
	    return convert;
	}
	
	public static void main(String args[])
    {
	 System.out.println("Enter the string");
	 Scanner inp = new Scanner( System.in ); 
	 String key = inp.nextLine();				//Input the String
	 int output = stringToInteger(key);			//converting string to integer
	 System.out.println(output);
    }
}
