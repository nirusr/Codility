package com.srini.codility;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class NextSmallest {

	public static void main(String[] args) {

		int[] A = { 1};
		int one = 1;
		//Check for Empty Array
		if ( A.length == 0) {
			System.out.println(one);
			System.exit(0);
		}

		SortedSet<Integer> sortedSetA = new TreeSet<Integer>();

		for (int ele : A) {
			sortedSetA.add(ele);
		}

		ArrayList<Integer> sortedArrayA = new ArrayList<Integer>();
		sortedArrayA.addAll(sortedSetA);
		
		int len = sortedArrayA.size();
		
		boolean found = false;
		int lastEle = sortedArrayA.get(len - 1);
		//for all elements are negative...
		if (lastEle < 0 || lastEle == 0) {
			System.out.println(one);
			found = true;
		}
		//Array with one positive non zero
		if ( lastEle > 0) {
			System.out.println((lastEle+1));
			found = true;
		}
		
		
		
		if (!found) {
			for (int i = 0; i < len - 1; i++) {
		     	int begEle = sortedArrayA.get(i).intValue();
				int nextEle = sortedArrayA.get(i + 1).intValue();
				if (begEle > 0 && nextEle > 0) {
					if (nextEle != (begEle + 1)) {
						System.out.println((begEle + 1));
						found = true;
						break;
					}
				}

			}

		}

		if (!found) {
			int begEle = sortedArrayA.get(len - 2).intValue();
			int nextEle = sortedArrayA.get(len - 1).intValue();
			if (begEle > 0 && nextEle > 0) {
				if (nextEle != (begEle + 1)) {
					System.out.println(begEle + 1);
					found = true;
				} else {
					System.out.println((nextEle + 1));
					found = true;
				}
			}

		}
		if (!found) {
			int begEle = sortedArrayA.get(len - 2).intValue();
			int nextEle = sortedArrayA.get(len - 1).intValue();
			if (begEle < 0 && nextEle > 0) {
				
					System.out.println((nextEle + 1));
					found = true;
				}
			}
			
		}

	

}
