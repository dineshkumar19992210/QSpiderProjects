package com.test;

public class Loops {
	
	public static void main(String[] args) {
		
		for(int i=21; i<=40; i=i+2) {
			System.out.println("Number " + i);
		}
		
		int i = 100;
		while(i<200) {
			System.out.println("Serial No " + i);
			i = i + 5;	
		}
		
		System.out.println("while loop Ends");
		
		do {
			System.out.println("do while Serial No " + i);
			i = i + 5;	
		}while(i<100);
		
		
	}

}
