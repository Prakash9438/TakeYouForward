package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoString {
	
	public static void main(String[] args) {
		List<String> s1 = Arrays.asList("Hello");
		List<String> s2 = Arrays.asList("World");
		
		Stream<String> stream = Stream.concat(s1.stream(), s2.stream());
		List<String> list = stream.toList();
		System.out.println(list);
		
	}
}
