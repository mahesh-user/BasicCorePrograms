package com.bridgelabz;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("enter a value");
        int n = value.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact*i;


        }
        System.out.println( "fact " + n + " is " + fact);
    }
}
