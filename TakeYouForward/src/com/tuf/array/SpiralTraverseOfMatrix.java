package com.tuf.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverseOfMatrix {
	public static List<Integer> getSpiralMatrix(int arr[][]) {
		int n = arr.length;
		int m = arr[0].length;
		List<Integer> ans = new ArrayList<Integer>();

		int top = 0, left = 0;
		int right = m - 1, button = n - 1;

		while (left <= right && top <= button) {
			// 1.left to right
			for (int i = left; i <= right; i++) {
				ans.add(arr[top][i]);
			}
			top++;

			// 2.Top to Button
			for (int i = top; i <= button; i++)
				ans.add(arr[i][right]);
			right--;

			// 3.Right to left
			if (top <= button) {
				for (int i = right; i >= left; i--)
					ans.add(arr[button][i]);
				button--;
			}

			// 3.Button to Top
			if (left <= right) {
				for (int i = button; i >= top; i--)
					ans.add(arr[i][left]);
				left++;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		List<Integer> spiralMatrix = getSpiralMatrix(mat);
		System.out.println(spiralMatrix);
	}
}
