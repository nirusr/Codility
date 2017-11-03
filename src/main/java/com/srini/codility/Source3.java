package com.srini.codility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Source3 {
	public static void main(String[] args) {
		
		int[] A = {3,4,7,9,10,11,11,11};
		Arrays.sort(A);
		int len = A.length;
		int[] half1 = Arrays.copyOfRange(A, 0, len/2);
		int[] half2 = Arrays.copyOfRange(A, len/2, len);
		
		Set<Integer> dedupArr1 = new HashSet<Integer>();
		Set<Integer> dedupArr2 = new HashSet<Integer>();

		for ( int ele: half1) {
			dedupArr1.add(ele);
		}
		for ( int ele: half2) {
			dedupArr2.add(ele);
		}
		
		int firstHalf = dedupArr1.size();
		int secondHalf = dedupArr2.size();
		int max = 0;
		int min = 0;
		if ( firstHalf > secondHalf) {
			max = firstHalf;
			min = secondHalf;
		} else {
			max = secondHalf;
			min = firstHalf;
		}
		System.out.println("max:" + max +"," + "min:" + min);
		
		
	}
}
