package com.automation;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
	
	public static void main(String[]args)
	{
		
		Collection<String> l= new ArrayList<String>();
		
		l.add("dinesh");
		l.add("arun");
		l.add("ronaldo");
		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("dinesh"));
		
		
	}

}

