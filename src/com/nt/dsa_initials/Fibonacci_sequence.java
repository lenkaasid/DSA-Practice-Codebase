package com.nt.dsa_initials;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_sequence {

	static ArrayList<Integer> getfibonacciseq(int n) {
		int a, b, c, i;
		ArrayList<Integer> al = new ArrayList<Integer>();
		a = 0;
		b = 1;
		al.add(a);
		al.add(b);
		for (int j = 1; j < n - 2; j++) {
			c = a + b;
			al.add(c);
			a = b;
			b = c;
		}
		return al;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter n value ");
		int n = scn.nextInt();
		System.out.println(Fibonacci_sequence.getfibonacciseq(n));

	}

}
