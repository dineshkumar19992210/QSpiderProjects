package com.test;

public class Operators {

	static int a = 50; // global variable
	static int b = 23; // global variable

	public static void main(String[] arg) {

		int b = 30; // local variable
		int c = 40;

		System.out.println(a - c);
		System.out.println(a <= 9);

		int amount = 100;
		int applePrice = 100;

		// Normal if else
		if (amount >= applePrice) { // condition true - if block executes
			System.out.println(" buy apples ");
		} else {
			System.out.println(" buy oranges");
		}

		// Nested if

		int time2 = 1;
		int date = 10;
		if (time2 == 1) {
			if (date == 10) {
				System.out.println("Watch Avatar");
			}
		}

		String day = "friday";
		// if else if
		if (day == "monday") {
			System.out.println("Watch Thiruchittrambalam");
		} else if (day == "tuesday") {
			System.out.println("if block Watch Nane Varuven");
		} else if (day == "wednesday") {
			System.out.println("Watch Maanadu");
		} else if (day == "friday") {
			System.out.println("Watch Vikram");
		} else {
			System.out.println("No Movies ");
		}

		day = "monday";
		switch (day) {
		case "monday":
			System.out.println("Watch Thiruchittrambalam");
			System.out.println("hi");
			break;
		case "tuesday":
			System.out.println("Watch Nane varuven");
			break;
		case "wednesday":
			System.out.println("Watch Maandau");
			break;
		case "friday":
			System.out.println("Watch Vikram");
			break;
		default:
			System.out.println("default: sunday No Movies");
			break;
		}
		
		int mark = 90;
		
		 if(mark >= 80 && mark < 90) {
			
			System.out.println("grade a");
			
							
		} else if(mark >= 70 && mark <80) {
			
			System.out.println("grade b");
			
		}else if (mark >= 60 && mark <70) {
			
			System.out.println("grade c");
			
		}else if (mark >= 50 && mark <60) {
			
			System.out.println("grade d");
			
		}else if(mark >= 90 && mark <= 100) {
			
			System.out.println("grade s");
			
		} else { 
			
			 System.out.println("faild");
			 
		}
			
	
	}
	
	
}
