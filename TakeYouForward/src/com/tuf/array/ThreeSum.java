package com.tuf.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSum {

	public static List<List<Integer>> tripletBruteForce(int arr[]) {
		int n = arr.length;

		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
						temp.sort(null);
						set.add(temp);
					}
				}
			}
		}
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.addAll(set);
		return list;
	}

	public static List<List<Integer>> tripletBetter(int arr[]) {
		int n = arr.length;

		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < n; i++) {
			HashSet<Integer> temp = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int value = -(arr[i] + arr[j]);
				if (temp.contains(value)) {
					List<Integer> asList = Arrays.asList(arr[i], arr[j], value);
					asList.sort(null);
					set.add(asList);
				}
				temp.add(arr[j]);
			}
		}
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.addAll(set);
		return list;
	}

	public static List<List<Integer>> tripletOptimal(int arr[]) {
		int n = arr.length;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			// remove duplicate
			if (i != 0 && arr[i] == arr[i - 1])
				continue;
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					List<Integer> asList = Arrays.asList(arr[i], arr[j], arr[k]);
					list.add(asList);
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1])
						j++;
					while (j < k && arr[k] == arr[k + 1])
						k--;
				}
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		// List<List<Integer>> list = tripletBruteForce(arr);
		// list.forEach(System.out::println);

//		List<List<Integer>> tripletBetter = tripletBetter(arr);
//		tripletBetter.forEach(System.out::println);

		List<List<Integer>> tripletOptimal = tripletOptimal(arr);
		tripletOptimal.forEach(System.out::println);
	}

}
