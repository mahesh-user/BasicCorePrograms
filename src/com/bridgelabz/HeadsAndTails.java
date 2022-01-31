package com.bridgelabz;
import java.util.Scanner;
public class HeadsAndTails {
    public static void main(String[] args) {


        Scanner value = new Scanner(System.in);
        int y = value.nextInt();
        System.out.println(" enter a value ");

        int headCounts = 0;
        int tailsCount = 0;

        for (int i = 1; i < y; i++) {
            if (y > 0.5) {
                headCounts = headCounts + 1;
                System.out.println(" coin is heads ");
            } else {
                tailsCount = tailsCount + 1;
                System.out.println(" coin is tails ");
            }
            System.out.println(headCounts + " " + tailsCount);

            System.out.println("heads percentage is " + (float) (headCounts / y) * 100);
            System.out.println("tails percentage is " + (float) (y - headCounts) / y * 100);
        }

    }

}
