package Leetcode.AllQuestion;

import java.util.Arrays;

public class SortArrayParity_922 {
	public static int[] sortArrayByParityII(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		int even = 0;
		int odd = 1;
		Arrays.sort(nums);
		for (int i = 0; i < n; i++) {
			if (nums[i] % 2 == 0) {
				ans[even] = nums[i];
				even += 2;
			} else {

				ans[odd] = nums[i];
				odd += 2;

			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 2, 5, 7 };
		int[] ans = sortArrayByParityII(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
