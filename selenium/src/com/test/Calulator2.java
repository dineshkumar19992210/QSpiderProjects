package com.test;

public class Calulator2 {
	
	private int z;
	
	public Calulator2() {} //default constructor
	
	public static void main(String[] args) {
		
		//ClassName objectName = new ClassName(); -- object creation syntax
		Calulator2 cal = new Calulator2();
		
		System.out.println(      cal.add(100, 20)       );
		System.out.println(cal.sub(200,155));
		System.out.println(cal.div(10,45));
		System.out.println(cal.mul(1,55));
	}
	
	public int add(int x, int y) {
		z =  x + y;
		return z;
	}

	public  int sub(int x,int y) {
		z = x - y;
		return z;
	}
	public float div(float x,float y) {
		
		return x / y;
	}
	public int mul(int x,int y) {
		z = x * y;
		return z;
	}
}


