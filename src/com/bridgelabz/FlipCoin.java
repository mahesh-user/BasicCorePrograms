package com.bridgelabz;


import java.util.Scanner;

public class FlipCoin {

    public static void main(String args[]) {
            double result = 0;
        Scanner value = new Scanner(System.in);
        System.out.println("enter a value");
        int n = value.nextInt();
        for (int i=1; i<=n; i++ ) {

             result = Math.pow(2, i);

        }
        System.out.println( "2 pow " + n + " is" + result);

    }


    }

