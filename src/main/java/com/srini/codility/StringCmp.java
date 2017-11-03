package com.srini.codility;
import java.util.Scanner;
//import org.apache.commons.lang.WordUtils;


public class StringCmp {
	public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        int len = A.length() + B.length();
	        System.out.println(len);
	        System.out.println( A.compareTo(B) > B.compareTo(A) ? "Yes" : "No");
	        
	        StringBuffer s = new StringBuffer();
	        String p1 = A.substring(0, 1).toUpperCase();
	        String p2 = A.substring(1,A.length());
	        s.append(p1).append(p2);
	        
	        String q1 = B.substring(0, 1).toUpperCase();
	        String q2 = B.substring(1,B.length());
	        
	        s.append(" ").append(q1).append(q2);
	        
	       
	        String a = "abcd";
	        String b = "abd";
	        System.out.println(a.compareTo(b) );
	        
	        System.out.println(s);
	        /* Enter your code here. Print output to STDOUT. */
	        
	    }
}
