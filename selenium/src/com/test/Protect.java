package com.test;

import java.util.Scanner;
public class Protect {

	public static void main (String[]args) {
		Scanner scannerobject = new Scanner(System.in);
		
		int num= scannerobject.nextInt();
		
		
		for(int i=1; i<=10; i=i+1) {
			
			int multi= i*num;
			System.out.println(multi);
			
		}
	}
}
