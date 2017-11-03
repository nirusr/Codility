package com.srini.codility;
import java.util.Arrays;

public class TapeEquilibrium {
	public static void main(String[] args) {
		
		
		int A[] = { 3, 1, 2, 4, 3 };
		int[] diff = new int[A.length-1];
		int psum1=0;
		int psum2 = 0;
		int i =0;
		int j = 0;
		int k = 0;
		for (  i = 0; i < A.length-1; i++ ) {
			psum1 = 0;
			for ( j = 0; j <= i; j ++ ) {
				psum1 = psum1+A[j];
				
			}
			psum2 = 0;
			for ( k = i+1; k <= A.length-1; k++) {
				psum2 = psum2 + A[k];
			}
			
			System.out.println(psum1 + "," + psum2);
			System.out.println( Math.abs(psum1 - psum2));
			diff[i] = Math.abs(psum1 - psum2);
			
		}
		Arrays.sort(diff);
		System.out.println(diff[0]);
	}
}
