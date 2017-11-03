package com.srini.codility;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class SubStrCmp {

	public static void main(String[] args) {
		String s = "welcometojava"; // 13
		int len = s.length();
		char ch;
		String substr = "";
		Stack st = new Stack();
		SortedSet set = new TreeSet();

		for (ch = 'a'; ch <= 'z'; ch++) {

			for (int l = 0; l < len - 2;) {
				int loc = s.indexOf(ch, l);
				if (loc != -1) {
					l = loc + 1;
					if ((loc + 3) <= len) {

						substr = s.substring(loc, loc + 3);
						st.push(substr);
						set.add(substr);
						System.out.print(substr + " ");

					}
				}
				l++;

			}
		}
		System.out.println(st.firstElement() + "|" + st.lastElement());
		System.out.println(set.first()+ "|" + set.last());

	}

}
