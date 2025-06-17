package Leetcode.AllQuestion;

public class ConsecutiveCharacter_1446 {
	public static int maxPower(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int c = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				c++;
				i++;
			}
			count = Math.max(c, count);
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "abbcccddddeeeeedcba";
		System.out.println(maxPower(s));
	}
}
