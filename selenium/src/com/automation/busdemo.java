package com.automation;
import java.util.Scanner;

public class busdemo {
	
	public static void main(String[]args)
	{
		
		
		
		int useropt=1;
		Scanner scanner=new Scanner(System.in);
		while(useropt==1) {
			System.out.println("enter 1 to book and 2 to exit");
		}
		useropt= Scanner.nextInt();
		if(useropt==1) {
			System.out.println("booking....");
		}
		
		
		
	}

}
