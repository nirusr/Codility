package com.srini.codility;

public class RString {
	
	public static void main(String[] args) {
		StringBuffer tempString = new StringBuffer();
		String s1 = "DAD";
		for (int i = s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
			tempString.append(s1.charAt(i));
			
		}
		if (s1.equalsIgnoreCase(tempString.toString())) {
			System.out.println(tempString);
		}
		
		 
		       
		        char[] s1char = s1.toLowerCase().toCharArray();
		        int r = s1.length() - 1;
		        for (int b = 0; b < s1.length(); b++ ) {
		            if ( s1char[r] != s1char[b] ) {
		               System.out.println("Not the same");
		               break;
		            } else {
		                r--;
		                if (r == 0 ) System.out.println("Same");
		            }
		        }
		      
		    
		
	}
}
