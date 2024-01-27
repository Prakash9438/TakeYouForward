package com.tuf.numberProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorOfNumbers {

	public static List<Integer> getDivisor(int n) {
		// Write your code here
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
				if (n / i != i)
					list.add(n / i);
			}

		}

		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		System.out.println(getDivisor(5));
		System.out.println(getDivisor(10));
		System.out.println(getDivisor(7));
	}
}
