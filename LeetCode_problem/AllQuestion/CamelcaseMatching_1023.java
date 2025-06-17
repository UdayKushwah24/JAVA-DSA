package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching_1023 {

	public static List<Boolean> camelMatch(String[] queries, String pattern) {
		List<Boolean> list = new ArrayList<>();

		for (int i = 0; i < pattern.length()-1; i++) {
			StringBuilder str = new StringBuilder();
			// int ch1 = pattern.charAt(i); 
			// int ch2 = pattern.charAt(i+1); 
			while (i < pattern.length()-1 && pattern.charAt(i) >= 'a' && pattern.charAt(i) <= 'z' && pattern.charAt(i+1) >= 'A' && pattern.charAt(i+1) <= 'Z' ) {
				str.append(pattern.charAt(i));
			}
			for (int j = 0; j < queries.length; j++) {
				
			}
		}
		
		return list;
    }
	public static void main(String[] args) {
		String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
		String pattern = "FB";
		System.out.println(camelMatch(queries, pattern));
	}
}
