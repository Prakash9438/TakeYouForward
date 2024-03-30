package com.list;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumofDigits {

	
	public static int getSum(int n) {
		int sum = Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
		return sum;
	}
	
	public static int getSum1(int n) {
		int sum = String.valueOf(n).chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
		return sum;
	}
	
	public static double getAvg(int n) {
		double avg = String.valueOf(n).chars()
				.map(Character::getNumericValue).average().getAsDouble();
		System.out.println(avg);
		return avg;
	}
	
	public static void main(String[] args) {
		getSum1(122);
		getAvg(122);
	}
}
