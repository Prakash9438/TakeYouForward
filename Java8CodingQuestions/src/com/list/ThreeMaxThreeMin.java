package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeMaxThreeMin {

	public static List<Integer> getThreeMaxThreeMin(){
		List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> threeMin = list.stream().sorted(Comparator.naturalOrder())
				.limit(3).collect(Collectors.toList());
		
		List<Integer> threeMax = list.stream().sorted(Comparator.reverseOrder())
		.limit(3).collect(Collectors.toList());
		
		System.out.println(threeMax);
		System.out.println(threeMin);
		
		List<Integer> mergeList = Stream.concat(threeMax.stream(), threeMin.stream()).toList();
		return mergeList;
	}
	
	public static void main(String[] args) {
		System.out.println(getThreeMaxThreeMin());
	}
}
