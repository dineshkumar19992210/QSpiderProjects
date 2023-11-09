package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Set;

import com.inheritence.Parent;

import java.util.HashSet;


public class Collections {
	
	public static void main(String[] args) {
		
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10); //index 0
		arrayList.add(10);
		arrayList.add(164);
		arrayList.add(186);
		arrayList.add(6);
		
		
		int sum=0;
		for(int i=0; i<arrayList.size(); i = i +1) {
			sum = sum + arrayList.get(i);
		}
		
		for(Integer value: arrayList) {
			//System.out.println("arrayList value: " +value);
		}
		
		//System.out.println(sum);
		System.out.println(arrayList);
		
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.get(0);
		
		Map<Integer, String> map = new HashMap<>(); 
		map.put(1, "arun");
		map.put(20, "dinesh");
		System.out.println(map);
		for(Entry<Integer, String> entry: map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			//System.out.println("key: " + key);
			//System.out.println("value: " + value);
		}
		
		Integer[] a = new Integer[5];
		a[0] = 2323;
		a[1] = 2022;
		for(Integer val: a) {
			//System.out.println(val);
		}
		
		LinkedHashMap<Integer,Integer> linkedmap =new LinkedHashMap<>();
		 linkedmap.put(1,5);
		 linkedmap.put(3,7);
		 //System.out.println(linkedmap);
		int val = linkedmap.get(3);
		 //System.out.println(val);
		 
		 Set<Integer> set = new HashSet<>();
		 set.add(10);
		 set.add(10);
		 set.add(110);
		 set.add(110);
		 System.out.println(set);
		 for(Integer val1: set) {
			 System.out.println(val1);
		 }
		 
		 
		 Parent p = new Parent();
		 
	}

}
