package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 1;
        int number;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = input.nextInt();
        System.out.println("Enter the number: ");
        int b = input.nextInt();
        System.out.println("Enter the number: ");
        int c = input.nextInt();
        if( a > b && a > c){
            System.out.println("the largest number is " + a);
        }
        else if( b > c && b > a){
            System.out.println("the largest number is " + b);
        }
        else {
            System.out.println("the largest number is " + c);
        }

    }
}




