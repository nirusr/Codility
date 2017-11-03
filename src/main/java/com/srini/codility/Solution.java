package com.srini.codility;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
	
	public static void main(String[] args) {
    int[] A = { -1,-3};
        int len = A.length;
        SortedSet<Integer> sortedArray = new TreeSet<Integer>();
        for( int i : A) {
            sortedArray.add(new Integer(i));
        
        }
        ArrayList<Integer> sourceArr = new ArrayList<Integer>();
        boolean found = false;
       
        sourceArr.addAll(sortedArray);
        
        int len1 = sourceArr.size();
        for(int j = 0; j < len1-1; j++ ) {
        		if ( (sourceArr.get(j) + 1)  == (sourceArr.get(j+1))) {
        			continue;
        		} else {
        			found = true;
        			System.out.println(sourceArr.get(j) + 1);
        			break;
        		}
        }
        if (!found) {
        		System.out.println((sourceArr.get(len1-1) + 1));
        }
        
        
        
    }
}
