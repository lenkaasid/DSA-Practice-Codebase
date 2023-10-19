package com.nt.dsa_initials;

import java.util.Scanner;

public class FibonacciSequence02 {

    static void getFibonacciSeq(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        if (n == 1) {
            System.out.println("0");
            return;
        }
        if (n == 2) {
            System.out.println("0 1");
            return;
        }

        int a = 0, b = 1, c;
        System.out.print("0 1 ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scn.nextInt();
        getFibonacciSeq(n);
    }
}
