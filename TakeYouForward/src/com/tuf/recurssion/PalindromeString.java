	package com.tuf.recurssion;

public class PalindromeString {

	public static boolean palindrome(String str) {
		int l =0;
		int r = str.length()-1;
		
		while(l<=r) {
			if(str.charAt(l)!=str.charAt(r))
				return false;
			l++;r--;
		}
		return true;
	}
	
	public static boolean palindromeRecurssion(String s,int i,int n) {
		if(i>=n/2)
			return true;
		if(s.charAt(i)!=s.charAt(n))
			return false;
		return palindromeRecurssion(s, i+1, n-1);
	}
	
	public static void main(String[] args) {
		//System.out.println(palindrome("madamm"));
		System.out.println(palindromeRecurssion("madamm",0,"madamm".length()-1));
	}
}
