package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddingPrefixSufixDelimeter {

	public static String getModifiedString() {
		List<String> list = Arrays.asList("Lenova","Apple","HP","Dell");
		String result = list.stream().collect(Collectors.joining(", ", "[", "]")).toString();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getModifiedString());
	}
}
