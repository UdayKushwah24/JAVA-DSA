package Leetcode.AllQuestion;

public class MaxSumCircularSubArray_918 {
	public static int maxSubarraySumCircular(int[] nums) {
		int n = nums.length;
		int[] dupArr = new int[2 * n];
		int idx = n;
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			dupArr[i] = num;

			dupArr[idx] = num;
			idx++;
		}
		for (int i = 0; i < dupArr.length; i++) {
			System.out.print(dupArr[i] + " ");
		}
		System.out.println();

		int max = Integer.MIN_VALUE;
		int ans = 0;
		for (int i = 0; i < dupArr.length; i++) {
			ans += dupArr[i];
			max = Math.max(ans, max);
			if (ans < 0) {
				ans = 0;
			}
		}
		return max;

	}
	public static void main(String[] args) {
		// int[] num = { 1, -2, 3, -2 };
		int[] num = { 5, -3, 5 };
		System.out.println(maxSubarraySumCircular(num));
	}
}
