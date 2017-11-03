package com.srini.codility;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
				
		
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
       
        
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            
            String prStr = String.format("%-16s%03d", s1,  x);
            System.out.println(prStr);
        }
        System.out.println("================================");
        
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++ ) {
            String prStr = String.format("%d%s%d%s%d", n," x ",i, " = ", n*i );
            System.out.println(prStr);
        }
            
	

	}
}
