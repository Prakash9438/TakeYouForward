package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateEvenOdd {

	public static void separateEvenOdd(List<Integer> list) {
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
		Set<Entry<Boolean, List<Integer>>> entrySet = map.entrySet();
		
		System.out.println(entrySet);
		
//		for(Entry<Boolean, List<Integer>> entry : entrySet) {
//			if(entry.getKey()) {
//				System.out.println("Even No");
//			}else {
//				System.out.println("Odd Number");
//			}
//			List<Integer> value = entry.getValue();
//			value.forEach(System.out::println);
//		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		separateEvenOdd(list);
	}
}
