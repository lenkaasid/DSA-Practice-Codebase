package com.nt.dsa_initials;
//The code you provided is written in Java and calculates the factorial of a given number. 
import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number find the Factorial");
		int num=scn.nextInt();
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		System.out.println("Factorial of "+num+" is : "+f);

	}

}
