package com.srini.codility;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ShipZip {

	public static void main(String[] args) {
		// Read from file
		List<String> input = null;
		try {
			input = Files.readAllLines(Paths.get("/Users/srinivasangovindaraji/Documents/zipcode.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<String> arrZipcodes = new ArrayList<String>();
		ArrayList<Integer> sortedZipCode = new ArrayList<Integer>();
		SortedSet<Integer> sortAndDedupZipCode = new TreeSet<>();
		for (String zipcode : input) {
			String[] strZipcodes = zipcode.split(" ");
			System.out.println(strZipcodes.length);
			for (int i = 0; i < strZipcodes.length; i++) {
				arrZipcodes.add(strZipcodes[i]);

			}

		}
		System.out.println(arrZipcodes.size());

		// Sort and Remove duplicate zip codes
		for (int j = 0; j < arrZipcodes.size(); j++) {
			sortAndDedupZipCode.add(Integer.parseInt(arrZipcodes.get(j)));
		}

		// Add zipcodes in arraylist for easy access
		sortedZipCode.addAll(sortAndDedupZipCode);
		System.out.println("");
		for (String z : arrZipcodes) {
			System.out.print(z + ",");
		}

		// debug
		System.out.println("");
		for (int z : sortedZipCode) {
			System.out.print(z + ",");
		}

		// Create range of Zipcodes
		int czip = sortedZipCode.get(0);
		int pzip = sortedZipCode.get(0);
		int bzip = sortedZipCode.get(0);

		int len = sortedZipCode.size();
		System.out.println("");

		for (int i = 0; i < len; i++) {
			czip = sortedZipCode.get(i);

			if ((czip - pzip == 1)) {
				pzip = czip;
			}

			if ((czip - pzip) > 1) {
				System.out.println("{" + bzip + " " + pzip + "}");
				bzip = czip;
				pzip = czip;

			} else {
				if (i == (len - 1)) {
					System.out.println("{" + bzip + " " + pzip + "}");
				}
			}

		}
	}

}
