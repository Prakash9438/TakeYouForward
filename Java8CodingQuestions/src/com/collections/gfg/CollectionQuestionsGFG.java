package com.collections.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class CollectionQuestionsGFG {

	public static int getMaxElemInVector() {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		System.out.println(vector);
		
		System.out.println(Collections.max(vector));
		return Collections.max(vector);
	}
	
	public static void binarySearch() {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		
		
		int index = Collections.binarySearch(vector, 1);
		
		System.out.println(index);
	}
	
	public static void arrayToList() {
		String arr[] = new String[] {"java",".NET","C#"};
		List<String> asList = Arrays.asList(arr);
		System.out.println(asList);
	}
	
	public static void listToArray() {
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		//list.remove(1);
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	public static void iterateHashMap() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		//System.out.println(map);
		
		//using keySet() and iterator
		/*
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			int next = iterator.next();
			System.out.println(next + "-->" + map.get(next));
		}
		 */
		
		// using entrySet() and Map.Entry interface
		/*
				Set<Entry<Integer, String>> entrySet = map.entrySet();
		
				Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
				while (iterator.hasNext()) {
					Entry<Integer, String> next = iterator.next();
					System.out.println(next.getKey() + "-->" + next.getValue());
				}
				*/
		
		//map.forEach((k,v)->System.out.println(k+"--"+v));
		
		map.entrySet().stream().forEach(k->System.out.println(k.getKey()+" "+k.getValue()));	
		
	}
	
	public static void printHashTableUsingEnumeration() {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		Enumeration enumeration = map.elements();
		while(enumeration.hasMoreElements()) {
			String nextElement = (String) enumeration.nextElement();
			System.out.println(nextElement);
		}
		
	}
	
	public static void test() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.add(0, 0);
		list.set(0, 5);
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		//getMaxElemInVector();
		//binarySearch();
		//arrayToList();
		//listToArray();
		//iterateHashMap();
		//printHashTableUsingEnumeration();
		test();
	}
}
