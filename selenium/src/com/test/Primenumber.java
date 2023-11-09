package com.test;

public class Primenumber {

	public static void main(String[] args) {

		int num = 2;

		int count = 0;
		for (int i = 1; i <= num; i = i + 1) {
			int rem = num % i;
			if (rem == 0) {
				count = count + 1;
			}
		}
		if (count == 2) {
			System.out.println("prime");

		} else {
			System.out.println("not prime");

		}
	}
}