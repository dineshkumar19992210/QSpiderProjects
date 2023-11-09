package com.test;

public class Sumarray {

	public static void main (String[]args) {
		
	     int num[]=new int[5];
	     
		num[0]=43;
		num[1]=20;
		num[2]=15;
		num[3]=78;
		num[4]=111;
		
		int num2[] = { 43, 20, 15, 78, 111 };
	
	for (int i=0; i<=num.length-1; i=i+1 ) {
		int reminder=num[i]%2;
		
		if(reminder==0) {
			
			System.out.println(num[i] +" even num");
			
		} else {
			
			System.out.println(num[i]+" odd num");
		}
	}
		 

		 
		 
		 
		 
	}	    
	
}	


