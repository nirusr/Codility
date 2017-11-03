package com.srini.codility;
import java.util.Scanner;

public class StaticInitializer {
	static boolean flag;
	static Scanner sc = new Scanner(System.in);
	static int B;
	static int H;
	static {
		try {
			 B = sc.nextInt();
			 H = sc.nextInt();
			 if ( B <= 0 || H <= 0) {
				 flag = false;
				 System.out.println("java.lang.Exception:Breadth and height must be positive");
			 } else {
				 flag = true;
			 }
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
	
	
    
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main


}
