package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortStringInIncreasingOrder {

	public static List<String> getIncreasingString(){
		List<String> list = Arrays.asList("Java", "Python", "C#",
				"HTML", "Kotlin", "C++", "COBOL", "C");
		
		List<String> increasingList = list.stream()
				.sorted(Comparator.comparing(String::length)).toList();		
		
		System.out.println(increasingList);
		return increasingList;
	}
	
	public static void main(String[] args) {
		getIncreasingString();	
	}
}
