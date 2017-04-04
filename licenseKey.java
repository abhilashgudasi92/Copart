package Copart;
import java.util.*;
public class licenseKey {

		// Function to format licensekey
		public static String rearrangeLicenseKey(String s, int k) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = s.length() - 1; i >= 0; i--)
	            if (s.charAt(i) != '-')
	                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
	        return sb.reverse().toString().toUpperCase();
	    }
		
		 public static void main(String args[])
		    {
			 System.out.println("Enter the licence key randomly");
			 Scanner inp = new Scanner( System.in ); 
			 String key = inp.nextLine();				//Input the unformatted license key
			 int k = inp.nextInt();						//Length of each group
			 String output = rearrangeLicenseKey(key,k);
			 System.out.println(output);
		    }
	}