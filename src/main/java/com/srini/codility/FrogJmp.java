package com.srini.codility;

public class FrogJmp {
	
	public static int solution(int X, int Y, int D) {
		
		float q =  (float) ((Y-X)/(D*1.0));
		return (int)Math.ceil(q);
	}
	public static void main(String[] args) {
		System.out.println(FrogJmp.solution(10, 80, 30));
	}
}
