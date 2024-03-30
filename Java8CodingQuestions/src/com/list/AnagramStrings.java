package com.list;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramStrings {

	//Using Arrays class euquals() method
	public static boolean isAnagram(String s1,String s2) {
		return Arrays.equals(s1.chars().map(s->Character.toLowerCase((char)s)).sorted()
						.peek(s->System.out.print((char)s)).toArray(), 
				s2.chars().map(s->Character.toLowerCase((char)s)).sorted()
						.peek(s->System.out.print((char)s)).toArray());
	}
	
	//
	public static boolean isAnagram1(String s1,String s2) {
		s1 = Stream.of(s1.split("")).map(String::toLowerCase).collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toLowerCase).collect(Collectors.joining());
		
		return s1.equals(s2);
	}
	
	public static void sortStringArray() {
		String arr[] = new String[]{"sanjay","java","tushar"};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].charAt(0)>arr[j+1].charAt(0)) {
					String temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		//System.out.println(isAnagram("Silent", "listen"));
		sortStringArray();
	}
}
