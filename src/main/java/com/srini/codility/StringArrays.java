package com.srini.codility;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringArrays {
	
	public static int source (String[] A){
	
	//Check for Empty Array
	int len = A.length;
	if ( len == 0) {
		//TODO
		return 0;
	}
	//Sort, remove empty and  duplicates
	SortedSet<String> sortedSetB = new TreeSet<String>();
	for(String ele: A) {
		if ( ele.trim().length() != 0) {
		sortedSetB.add(ele);
		}
		
	}
	//Access array elements
	ArrayList<String> arrayListB = new ArrayList<String>();
	arrayListB.addAll(sortedSetB);
	
	//Print
	arrayListB.forEach(ele -> System.out.println(ele));
	
	
	
	return 0;
	
	}
	
	public static void main(String[] args) {
		String[] B = {"ABCD", " ", "BCD" };
		StringArrays.source(B);
	}
}