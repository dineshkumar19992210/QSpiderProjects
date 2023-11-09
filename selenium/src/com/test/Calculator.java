package com.test;

public class Calculator {

	public static int x = 10;
	public static int y = 20;
	public static int z;

	public static int add() { // method declaration syntax
		z = x + y; // instruction
		return z;
	}

	public static int sub() {
		z = x - y;
		return z;
	}

	public static int div() {
		z = x / y;
		return z;

	}

	public static int mul() {
		z = x * y;
		return z;
	}
	
	public static void main(String[] args) {
		System.out.println("Additon: " + add());
		System.out.println("sub:" + sub());
		System.out.println("division:" + div());
		System.out.println("multiplication:" + mul());
	}
}
