package com.string;

import java.util.List;

public class ToUpperCase {

	public static void main(String[] args) {
		List<String> list = List.of("java","html","css","sql");
		
		//convert to Upper Case
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("******************");
		//conver to Lower case
		list.stream().map(String::toLowerCase).forEach(System.out::println);
	}
}
