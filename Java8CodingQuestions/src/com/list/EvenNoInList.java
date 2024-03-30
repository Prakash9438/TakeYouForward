package com.list;

import java.util.Arrays;
import java.util.List;

public class EvenNoInList {

	public static List<Integer> getEvenNo(List<Integer> list){
		return list.stream().filter(n->n%2==0).toList();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenNo = getEvenNo(list);
		System.out.println(evenNo);
	}
}
