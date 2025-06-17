package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumValuesIndicesSet_2859 {
	private static int countBit(int i) {
		int c = 0;
		while (i > 0) {
			if (i % 2 == 1) {
				c++;
			}
			i /= 2;
		}
		return c;
	}
	public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (k == countBit(i)) {
				sum += nums.get(i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(5, 10, 1, 5, 2));
		int k = 1;
		System.out.println(sumIndicesWithKSetBits(nums, k));
	}
}
