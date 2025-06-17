package Leetcode.AllQuestion;

import java.util.*;
 
public class CountVowel_2062 {

	public static boolean isVowelSubString(String string) {
		List<Character> ll = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			if (!ll.contains(string.charAt(i))) {
				ll.add(string.charAt(i));
			}
		}

		System.out.println(ll);
		if (ll.size() > 5) {
			return false;
		}
		
		if (!ll.contains('a') || !ll.contains('e') || !ll.contains('i') || !ll.contains('o')
				|| !ll.contains('u')) {
			return false;
		}

		return true;
		
	}

	public static int countVowelSubstrings(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				String sub = word.substring(i, j+1);
				if (sub.length() > 4) {
					if (isVowelSubString(sub)) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// String word = "aeiouu";
		String word = "cuaieuouac";
		System.out.println(countVowelSubstrings(word));
	}
}
