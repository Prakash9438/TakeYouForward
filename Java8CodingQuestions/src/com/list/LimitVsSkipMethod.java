package com.list;

import java.util.Arrays;
import java.util.List;

public class LimitVsSkipMethod {

	public static void limitVsSkip() {
		List<Integer> list = Arrays.asList(1,2,5,4,3);
		//limit is an intermediate operation which returns steam not longer than the
		//required size
		list.stream().limit(7).forEach(System.out::println);
		
		//discard the first n element from the list
		//if n is higher than size, it return empty stream
		list.stream().skip(10).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		limitVsSkip();
	}
}
