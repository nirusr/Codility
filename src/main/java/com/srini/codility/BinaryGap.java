package com.srini.codility;

public class BinaryGap {
	public static void main(String[] args) {
		
		int n;
		n = 20;
		//System.out.println(Integer.toBinaryString(n));
		String binaryStr = Integer.toBinaryString(n);
		//String binaryStr = "10001000010000001";
		char one = '1';
		char zero = '0';
		int max = 0,len = 0;
		
		//System.out.println(binaryStr.lastIndexOf('a'));
		int beginIndex, nextIndex;
		for (int i = 0; i < binaryStr.length(); i++) {
			beginIndex = binaryStr.indexOf(one,i);
			if ( beginIndex > -1 ) {
				nextIndex = binaryStr.indexOf(one, beginIndex+1);
				if ( nextIndex > -1 ) {
					len = nextIndex - beginIndex - 1;
					if ( len > max) {
						max = len;
					} 
					//System.out.println("zeros:" + len);
					i = i + len;
				}
			}
			
			
		}
		System.out.println(max);
			
	}
}
