package Leetcode.AllQuestion;

import java.util.*;
public class LongestSubStringofVowels_1839 {
	/* public static int longestBeautifulSubstring(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			int ans = 0;
			char ch = word.charAt(i);
			while (i < word.length()-1 && word.charAt(i) == 'a') {
				c
				i++;
			}
			while (i < word.length()-1 && word.charAt(i) == 'a') {
				ans += 1;
				i++;
			}
		}
	} */

	public static int longestBeautifulSubstring(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			int ans = 1;
			while (i < word.length() - 1 && word.charAt(i) == 'a') {
				ans += 1;
				i++;
			}
			if (word.charAt(i) != 'e') {
				ans = 0;
			}
			while (i < word.length() - 1 && word.charAt(i) == 'e') {
				ans += 1;
				i++;
			}
			if (word.charAt(i) != 'i') {
				ans = 0;
			}
			while (i < word.length() - 1 && word.charAt(i) == 'i') {
				ans += 1;
				i++;
			}
			if (word.charAt(i) != 'o') {
				ans = 0;
			}
			while (i < word.length() - 1 && word.charAt(i) == 'o') {
				ans += 1;
				i++;
			}
			if (word.charAt(i) != 'u') {
				ans = 0;
			}
			while (i < word.length()   && word.charAt(i) == 'u') {
				ans += 1;
				i++;
			}
			count = Math.max(count, ans);
			ans = 0;
			 
		}
		return count;
	}

	public static void main(String[] args) {
		String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
		// String word = "aeeeiiiioooauuuaeiou";
		System.out.println(longestBeautifulSubstring(word));
	}
}
