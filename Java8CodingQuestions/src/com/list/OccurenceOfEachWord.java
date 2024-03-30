package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachWord {

	//find the occurence of eacgh word in the given string
	public static void getOccurence() {
		String str = "Welcome to code decode and code decode welcome";
		List<String> list = Arrays.asList(str.split(" "));
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}
	
	public static void main(String[] args) {
		getOccurence();
	}
}
