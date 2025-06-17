package Leetcode.AllQuestion;

public class CommonFactor_2427 {

	public static int commonFactors(int a, int b) {
		int count = 0;
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				count += 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int a = 12, b = 6;
		System.out.println(commonFactors(a, b));
	}
}
