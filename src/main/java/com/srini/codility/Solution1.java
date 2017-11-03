package com.srini.codility;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution1 {
	public static void main(String[] args) {
		int[] T ={3,4,7,9,10,7,7,9,6,8,8,8,9,11,12,9};
		HashSet<Integer> dedupHalfArray = new HashSet<Integer>();
		
		for ( int m = 0; m < T.length/2; m++) {
			dedupHalfArray.add(T[m]);
		}
		System.out.println(dedupHalfArray.size());
		
		//Arrays.sort(T);
		int len = T.length;
		int start = 0;
		int[] source1 = Arrays.copyOf(T, T.length/2);
		Arrays.sort(source1);
		int range = source1.length;
		
		int count = 0;
		for ( int i = start; i < range-1; i++) {
			if ( source1[i] != source1[i+1]) {
				count++;
			}
			
		}
		count = count + 1;
		//return count;
		System.out.println(count);

	}
}
