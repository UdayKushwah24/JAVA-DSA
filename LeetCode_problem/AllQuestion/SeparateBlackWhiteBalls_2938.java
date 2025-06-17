package Leetcode.AllQuestion;

public class SeparateBlackWhiteBalls_2938 {
	public static long minimumSteps(String s) {
		long count = 0;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				flag = true;
			}
			if (flag && s.charAt(i) == '0') {
				count++;
			}
				 
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "101";
		System.out.println(minimumSteps(s));
	}
}
