package com.test;

 import java.util.Scanner;
 
public class Scannertest {

	 
	 
	 public static void main (String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("enter your name");
		 String name = scan.next();
		 
		 System.out.println("enter your balance");
		 float amt = scan.nextFloat();
		 
		 System.out.println("you name is " + name);
		 System.out.println("you balance amount is " + amt);
	 }
}
	 

