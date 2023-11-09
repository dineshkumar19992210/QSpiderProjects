package com.test;

public class Numberccheck {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 28;
		a[2] = 65;
		a[3] = 4;
		a[4] = 77;
		a[4] = 1073;

	     int count =0;
		for (int i = 0; i <= a.length - 1; i = i + 1) {
			int num = a[i] ;
			for (int div = 1 ; div<=num ; div=div+1) {
				int rem	=num % div;	
				if(rem==0) {
				 count=count+1;
				}
			}
			if(count==2) { 
				System.out.println("prime "+a[i]);
			} else {
				System.out.println("not prime "+a[i]);
			}
		}	
  }
}