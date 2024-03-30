package com.string;

import java.util.HashMap;

public class Test {
	public static boolean isPalindrome(String s) {
		s = s.strip();
		if (s.length() == 0)
			return true;
		s = s.toLowerCase();
		String str = "";
		for (char ch : s.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				str += ch;
			}
		}
		return new StringBuilder(str).reverse().toString().equals(str);
	}

	public static boolean checkPalindrome(String s) {
		if (s.isEmpty())
			return true;

		int start = 0;
		int last = s.length() - 1;

		while (start <= last) {
			char curnFirst = s.charAt(start);
			char curnLast = s.charAt(last);

			if (!Character.isLetterOrDigit(curnFirst)) {
				start++;
			} else if (!Character.isLetterOrDigit(curnLast)) {
				last--;
			} else {
				if (Character.toLowerCase(curnFirst) != Character.toLowerCase(curnLast))
					return false;
				start++;
				last--;
			}
		}
		return true;
	}

	public static String convertToTitle(int c) {
		if (c < 27) {
			return Character.toString((char) ('A' + (c - 1)));
		}

		StringBuilder ans = new StringBuilder("");
		while (c > 0) {
			int x = c % 26;
			if (x == 0) {
				ans.append('Z');
				c--;
			} else {
				ans.append((char) ('A' + x - 1));
			}
			c /= 26;
		}
		return ans.reverse().toString();
	}

	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();

		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
			} else {
				if (map.containsKey(t.charAt(i)))
					return false;
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("foyo", "egg"));;
	}
}
