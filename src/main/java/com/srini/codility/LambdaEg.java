package com.srini.codility;


interface PrintFunc {
	public void printResult(int a, int b);
}

public class LambdaEg {
	
	public static void main( String[] args) {
		PrintFunc pf = (a,b) -> {
			System.out.println( a + "+" + b + "=" + (a+b) );
		};
		
		pf.printResult(5, 10);
	}
	
}