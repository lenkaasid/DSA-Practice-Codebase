package com.nt.dsa_initials;

import java.util.Scanner;

public class PrimeNumber1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or Not");
        int num = scn.nextInt();

        if (num <= 1) {
            System.out.println("Enter a number more than 1");
            return;
        }

        if (isPrime(num)) {
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number is not a prime number");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        int divisor = 5;
        while (divisor * divisor <= num) {
            if (num % divisor == 0 || num % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }
        return true;
    }
}
