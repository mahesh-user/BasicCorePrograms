package com.bridgelabz;

import java.util.Scanner;

public class AddOrEven {
    public static void main(String[] args) {
        int number = 0;
        Scanner value = new Scanner(System.in);
        System.out.println(" enter any integer value ");
        int a = value.nextInt();
        if (a % 2 == 0 ){
            System.out.println("it is a even nuber");
        }else{
            System.out.println(" it is a add number");
        }
    }
}
