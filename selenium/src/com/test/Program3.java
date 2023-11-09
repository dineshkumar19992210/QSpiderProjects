package com.test;

import java.util.Scanner;

public class Program3 {

	public static void main(String[]args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("ENTER YOU NUMBER ");
		
	     int number1 = userinput.nextInt();
	     
		System.out.println("ENTER YOUR NUBER ");
		int number2 = userinput.nextInt();
	     
	   
	   int number3 =number1*number2;
	   System.out.println("output " +number3);
	}
}
