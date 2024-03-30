package com.tuf.dp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

	public static List<Integer> getPermutation(List<Integer> list) {
		int index = -1;
		int n = list.size();
		for (int i = n - 2; i >= 0; i--) {
			if (list.get(i) < list.get(i + 1)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			Collections.reverse(list);
			return list;
		}

		for (int i = n - 1; i > index; i--) {
			if (list.get(i) > list.get(index)) {
				int temp = list.get(i);
				list.set(i, list.get(index));
				list.set(index, temp);
				break;
			}
		}

		List<Integer> subList = list.subList(index + 1, n );
		Collections.reverse(subList);
		return list;

	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
		System.out.println(getPermutation(A));

	}
}
