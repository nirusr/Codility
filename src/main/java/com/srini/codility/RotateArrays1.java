package com.srini.codility;

public class RotateArrays1 {
	
	
	public static int noRotation(int k, int len) {
		
		k = k - len;
		if (k >= len ) {
			return noRotation(k, len);
		} else {
			return k;
		}
	}
	
	public static void main(String[] args) {
		int[] A = { 3,8,9,7,6};
		int K = 6;
		
		int len = A.length;
	
		if ( K >= len) {
			K = RotateArrays1.noRotation(K, len);
			System.out.println(K);
		}
		
		int[] B = new int[len];
		
		if ( K == 0) {
			B = A;
		}
		
		if ( K > 0) {
		for ( int i = 0; i < len; i++) {
			int pos = i + K;
			if ( pos >= len) {
				pos = pos - (len);
			}
			System.out.println(i +"," + pos);
			B[pos] = A[i];
			
		}
		}
		for ( int z: B) {
			System.out.print(z +",");
		}
		
	}
	
	
	
	
}
