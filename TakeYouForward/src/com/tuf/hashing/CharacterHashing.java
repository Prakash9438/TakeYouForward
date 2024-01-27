package com.tuf.hashing;

import java.util.Arrays;

public class CharacterHashing {

	public static int bruteForce(char arr[],char ch) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch)
				count++;
		}
		return count;
	}
	
	public static int hashing(char[] arr,char ch) {
		int hash[]=new int[26];
		
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]-'a']++;
		}
		System.out.println(Arrays.toString(hash));
		return hash[ch-'a'];		
	}
	
	public static int forAllCharacter(char arr[],char ch) {
		int hash[]= new int[256];
		
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		
		for(int i=0;i<hash.length;i++) {
			if(hash[i]!=0)
				System.out.println((char)i+"->"+hash[i]);
		}
		
		return hash[ch];
	}
	
	
	public static void main(String[] args) {
		//System.out.println(bruteForce(new char[] {'a','x','a','b','v'}, 'a'));
		//System.out.println(hashing(new char[] {'a','x','a','b','v'}, 'z'));
		System.out.println(forAllCharacter(new char[] {'a','x','a','b','v','1','@','*','*'}, '*'));
	}
}
