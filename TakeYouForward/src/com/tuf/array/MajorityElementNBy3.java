package com.tuf.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementNBy3 {

	public static List<Integer> getMajorityElem(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (list.size() == 0 || list.get(0) != arr[i]) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j])
						count++;
				}
				if (count > (arr.length / 3))
					list.add(arr[i]);
			}
			if (list.size() == 2)
				break;
		}
		System.out.println(list);
		return list;
	}

	public static List<Integer> bruteForce(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int min = (arr.length / 3) + 1;

		for (int i = 0; i < arr.length; i++) {
			int value = map.getOrDefault(arr[i], 0);
			map.put(arr[i], value + 1);

			if (map.get(arr[i]) == min)
				list.add(arr[i]);

			if (list.size() == 2)
				break;
		}

		System.out.println(list);
		return list;
	}

	public static List<Integer> getMajorityOptimal(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();

		int cnt1 = 0, cnt2 = 0;
		int elm1 = 0, elm2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (cnt1 == 0 && arr[i] != elm2) {
				cnt1 = 1;
				elm1 = arr[i];
			} else if (cnt2 == 0 && arr[i] != elm1) {
				cnt2 = 1;
				elm2 = arr[i];
			} else if (arr[i] == elm1)
				cnt1++;
			else if (arr[i] == elm2)
				cnt2++;
			else {
				cnt1--;
				cnt2--;
			}
		}

		int min = (arr.length / 3) + 1;

		for (int i = 0; i < arr.length; i++) {
			if (elm1 == arr[i])
				cnt1++;
			if (elm2 == arr[i])
				cnt2++;
		}

		if (cnt1 > min)
			list.add(elm1);
		if (cnt2 > min)
			list.add(elm2);

		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 33, 33, 11, 33, 11 };
		// getMajorityElem(arr);
		//bruteForce(arr);
		getMajorityOptimal(arr);
	}
}
