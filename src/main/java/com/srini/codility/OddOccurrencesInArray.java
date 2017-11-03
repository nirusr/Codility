package com.srini.codility;
import java.util.Arrays;

public class OddOccurrencesInArray {
	
	public static void main(String[] args) {
		
		int[] A = {9,3,9,3,9,7,9};
		
		Arrays.sort(A);
		boolean found = false;
		for ( int i = 0; i < A.length - 1; i++) {
			int nextpos = i+1;
			if ( A[i] == A[nextpos]) {
				i = nextpos;
				found = false;
			} else {
				System.out.println(A[i]);
				found = true;
				break;
				
			}
			
		}
		if ( !found) {
			System.out.println(A[A.length-1]);
		}
		
		
		
	}
	
}
