package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter values");
        double x = sc.nextInt();
        double y = sc.nextInt();
        double quotient = x / y;
        double remainder = x % y;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }
}
