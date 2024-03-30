package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@FunctionalInterface
interface Multiply{
	public int multiply(int a,int b);
}


public class FindDuplicateElem {
	
	private static int count=0;
	//get duplicate elements from the array list
	public static void getDuplicate() {
		List<Integer> list = Arrays.asList(1,2,5,4,2,2,3,6,8,9,12,56,3);
		Set<Integer> set = new HashSet<Integer>();
		//hs.add() return true if element not present and false if element is present
		list.stream().filter(n->set.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
	}
	
	//multiply two no using java 8
	
//	create a Functional Interface having multiply method
//	provide implementation using java 8
	public static void multiplyTwoNo() {
		Multiply m = (a,b)->a*b;
		System.out.println(m.multiply(2, 3));
	}
	
	//find first element of the list
	public static void findFirst() {
		List<Integer> list = Arrays.asList(1,2,5,4);
		list.stream().findFirst().ifPresent(System.out::println);
	}
	
	//reverse the decimal no in the given string
	public static void getReverseDecimal() {
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13);
		decimalList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		//getDuplicate();
		//multiplyTwoNo();
		//findFirst();
		getReverseDecimal();
	}
}
