package com.srini.codility;
import java.util.Arrays;
public class RotateArrays {
	public static int[]  rotate(int[] B) {
		int len = B.length;
		int pos = 0;
		int[] results = new int[len];
		int k =1;
		for ( int j = 0; j < len ; j ++ ) {
			pos = j + 1;
			if ( pos >= len) {
				pos = pos - len;
			}
			results[pos] = B[j];
			
			System.out.println("oldpos:" + j + " Newpos:" + pos);
			
		}
		
		return results;
	}
	
	public static int[]  rotate1(int[] B, int K) {
		int len = B.length;
		int pos = 0;
		int[] results = new int[len];
		int[] interArray = new int[len];
		interArray = B;
		for ( int i = 1; i <= K; i++) { 
			pos = 0;		
			results = new int[len];
			for ( int j = 0; j < len ; j ++ ) {
				pos = j + 1;
				if ( pos >= len) {
					pos = pos - len;
				}
				results[pos] = interArray[j];
				
				System.out.println("oldpos:" + j + " Newpos:" + pos);
				
			}
			interArray = results;
			
		}
		return interArray;
	}
	
	
	public static void main(String[] args) {
		int[] A = {3,8,9,7,6};
		int k = 3;
		int[] A2 = null;
		/*for ( int c = 1; c <=k ; c++ ) {
			A2 = RotateArrays.rotate(A);
			A = A2;
		}*/
		A2 = RotateArrays.rotate1(A, k);
		for (int l: A2) {
			System.out.print(l +",");
		}
	
		
	}
	
	
}
