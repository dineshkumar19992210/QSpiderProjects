package com.test;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int mark = 0;
		do {
			System.out.println("Enter your mark : ");

			mark = scanner.nextInt(); 

			if (mark >= 80 && mark < 90) {

				System.out.println("grade a");

			} else if (mark >= 70 && mark < 80) {

				System.out.println("grade b");

			} else if (mark >= 60 && mark < 70) {

				System.out.println("grade c");

			} else if (mark >= 50 && mark < 60) {

				System.out.println("grade d");

			} else if (mark >= 90 && mark <= 100) {

				System.out.println("grade s");

			} else {
				System.out.println("faild");
			}
		} while (mark >= 0);

		scanner.close();
		System.out.println("Program Ends");

	}

}
