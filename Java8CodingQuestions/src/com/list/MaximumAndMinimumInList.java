package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumAndMinimumInList {

	//Using sorted and Collections.reverseOrder()
	public static void printMaxAndMin() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int min = list.stream().sorted().findFirst().get();
		int max = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(max+" "+min);
	}
	
	//using stream API max() and min() method
	public static void printMaxAndMin1() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int min = list.stream().min(Comparator.naturalOrder()).get();
		int max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max+" "+min);
	}
	
	public static void main(String[] args) {
		//printMaxAndMin();
		printMaxAndMin1();
	}
}
