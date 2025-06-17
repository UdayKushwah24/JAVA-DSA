package Leetcode.AllQuestion;

public class PerfectSquare_279 {

	static int count = 0;
	static int ans = Integer.MAX_VALUE;

	public static void square(int n, int sum) {
		if (sum > n) {
			return;
		}
		if (sum == n) {
			ans = Math.min(ans, count);
			return;
		}
		for (int i = 1; i <= n; i++) {
			sum += i * i;
			count += 1;
			square(n, sum);
			sum -= i * i;
			count--;

		}
	}

	public static void main(String[] args) {
		// count = 0;
		int n = 13;
		square(n, 0);
		System.out.println(ans);
	}

}
