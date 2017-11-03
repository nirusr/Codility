package com.srini.codility;
public class PrintFact {

    public static int fact(int n) {
        if ( n <= 1 ) {
           return 1;
        } else {
            return n * fact(n-1);
        }
        
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++ ) {
            System.out.print(fact(i) + "," );
        
        }
    }





}