package Leetcode.AllQuestion;

import java.util.Arrays;

public class CountNumDistinctInteger_2442 {
	public static int countDistinctIntegers(int[] nums) {
		int n = nums.length;
		int[] dupArr = new int[2 * n];
		int idx = n;
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			dupArr[i] = num;
			int revNum = 0;
			while (num > 0) {
				int last = num % 10;
				revNum = revNum * 10 + last;
				num /= 10;
			}
			dupArr[idx] = revNum;
			idx++;
		}
		Arrays.sort(dupArr);
		for (int i = 0; i < dupArr.length; i++) {
			System.out.print(dupArr[i] + " ");
		}
		System.out.println();
		int count = 1;
		for (int i = 0; i < dupArr.length-1; i++) {
			if (dupArr[i] != dupArr[i+1]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 13, 10, 12, 31 };
		System.out.println(countDistinctIntegers(nums));
	}
}
