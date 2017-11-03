package com.srini.codility;
import java.math.*;
public class JavaLoops2 {
	
	public static void main (String args[]) {
		int n = 5;
		int a = 5;
		int b = 3;
		int[] sum = new int[n];
		sum[0] = (int) (a + Math.pow(2, 0) * b);
	
		System.out.print(sum[0] + " ");
		//System.out.println((int)Math.pow(2, 2));
		for (int i = 1; i < n; i++) {
			int bpow = (int) Math.pow(2,i);
			int bt =  (bpow * b);
			sum[i] = sum[i-1] + bt;
			System.out.print(sum[i] + " ");
			
		}
		
		
		
	}

}
