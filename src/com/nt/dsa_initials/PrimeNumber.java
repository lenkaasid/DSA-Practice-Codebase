package com.nt.dsa_initials;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to check Prime or Not");
		int num = scn.nextInt();
		if (num >= 1) {

			int factor = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					factor++;
				}
			}
			if (factor == 2) {
				System.out.println("Number is a prime number");
			} else {
				System.out.println("Number is not a prime number");
			}
		}else {
			System.out.println("Enter a number more than 0");
		}
	}

}
