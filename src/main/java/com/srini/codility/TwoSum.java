package com.srini.codility;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class TwoSum {

	
	public static void main(String[] args) {
		
		//[1,2,3,4,10,11,12] 5
		int[] input = {1,2,3,11,12,7,4,10,11,12};
		ArrayList<Integer> source1 = new ArrayList<Integer>();
		
		SortedSet<Integer> source = new TreeSet<Integer>();
		for( int i : input) {
			source.add(new Integer(i));
		}
		source.addAll(source);
		source1.addAll(source)	;	
		for ( int i = 0 ; i < source1.size(); i++) {
			for ( int j = i+1; j < source1.size(); j++) {
				if ( (source1.get(i) + source1.get(j)) == 5) {
					System.out.println(source1.get(i) + "," + source1.get(j));
				}
			}
			
		}
	}
}
