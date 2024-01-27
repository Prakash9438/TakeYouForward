package com.tuf.hashing;

import java.util.HashMap;

public class CharacterHashingUsingHashMap {

	public static int getCharFrequency(char arr[],char ch) {
		//take hash map having key as character and value as integer
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) 
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		if(map.containsKey(ch))
			return map.get(ch);
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(getCharFrequency(new char[] {'a','x','a','b','v','1','@','*','*'}, '7'));
	}
}
