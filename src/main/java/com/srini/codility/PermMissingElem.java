package com.srini.codility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PermMissingElem {
	
	public static int solution(int[] A) {
        int missingNumber=0;
       // int[] A = { 2, 3, 4, 5, 5, 6, 8, 9, 10};
		SortedSet<Integer> dedupArr = new TreeSet<Integer>();
		for ( int i : A) {
			dedupArr.add(i);
		}
		for (int ele : dedupArr) {
			System.out.println(ele);
		}
		ArrayList<Integer>B = new ArrayList<Integer>();
		B.addAll(dedupArr);
		int len = B.size();
		
		for ( int i = 1; i < len ; i++) {
			if ( B.get(i).intValue() != (B.get(i-1).intValue() + 1)) {
				//System.out.println("missing:" + (B.get(i-1)+1));
				missingNumber = B.get(i-1)+1;
				break;
			}
		}
		return missingNumber;
    }
	
	public static int[] dedup(int[] input) {
		int len = input.length;
		if ( len < 2 ) {
			return input;
		}
		
		Arrays.sort(input);
		int[] dedupArr = new int[len];
		for ( int i = 0; i<len-1; i++  ) {
			if ( input[i] == input[i+1] )	{
				continue;
			} else {
				dedupArr[i] = input[i];
			}
		}
		if ( input[len-2] != input[len-1]) {
			dedupArr[len-1] = input[len-1];
		}
		return dedupArr;
		
	}
	
	public static void main(String[] args) {
		
		int[] A = { 2, 3, 4, 5, 5, 6, 8, 9, 10};
		System.out.println(PermMissingElem.solution(A));
	}
}
