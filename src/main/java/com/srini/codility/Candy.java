package com.srini.codility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Candy {

	public static int solution(int[] T) {
		int len = T.length;
		if (T.length == 0) {
			// System.out.println(0);
			return 0;
		}

		Arrays.sort(T); // Sort Arrays

		

		// Divide arrays

		int[] half1 = Arrays.copyOfRange(T, 0, len / 2);
		int[] half2 = Arrays.copyOfRange(T, len / 2, len);

		Set<Integer> original = new HashSet<Integer>();
		int a = 0;
		for (int ele : T) {
			if (!original.add(ele)) {
				a++;

			}
		}

		if (a > 0 && a >= len / 2) {

			System.out.println(len / 2);
			return (len / 2);
		}

		// Remove Duplicates
		Set<Integer> dedupArr1 = new HashSet<Integer>();
		Set<Integer> dedupArr2 = new HashSet<Integer>();

		for (int ele : half1) {
			dedupArr1.add(ele);
		}
		for (int ele : half2) {
			dedupArr2.add(ele);
		}

		// Find max # of candidates
		int firstHalf = dedupArr1.size();
		int secondHalf = dedupArr2.size();
		int max = 0;

		if (firstHalf > secondHalf) {
			max = firstHalf;

			System.out.println(max);
			return max;
		} else {
			max = secondHalf;

			System.out.println(max);
			return max;
		}
	}

	public static void main(String[] args) {
		int[] T = { 3, 4, 7, 7, 7, 7, 8, 8 };
		// int[] T = {};
		Candy.solution(T);

	}

}
