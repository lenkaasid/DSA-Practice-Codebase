package com.nt.dsa_initials;

import java.util.Scanner;

public class factorial_Recursion {
	public static int fact(int n) {
		if (n==1) 
			return 1;
		else
			return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scn.nextInt();
		System.out.println("Factorial is :"+factorial_Recursion.fact(num));
	}

}
