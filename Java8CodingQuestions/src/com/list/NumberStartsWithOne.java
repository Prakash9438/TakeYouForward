package com.list;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWithOne {

	public static List<Integer> getNoStartsWithOne(List<Integer> list){
		return list.stream().map(n->""+n).filter(n->n.startsWith("1")).map(n->Integer.parseInt(n)).toList();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,411,112,566,21,155);
		List<Integer> noStartsWithOne = getNoStartsWithOne(list);
		System.out.println(noStartsWithOne);
	}
}
