package Leetcode.AllQuestion;
import java.util.Arrays;

public class LargestNumTwiceOfOther_747 {
	
	public static int dominantIndex(int[] nums) {
		 
		int[] temp = new int[nums.length];
		int idx = 0;
		for (int num : nums) {
			temp[idx++] = num;
		}
		Arrays.sort(nums);
		int ans = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			int largest = nums[nums.length - 1 - i];
			int half = largest / 2;
			for (int j = 0; j < nums.length; j++) {
				if (half == temp[j]) {
					ans = largest;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == ans) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 3, 6, 1, 0 };
		System.out.println(dominantIndex(nums));
	}
}
