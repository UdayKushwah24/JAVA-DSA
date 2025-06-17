package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm_989 {
 

	/* public static List<Integer> addToArrayForm(int[] num1, int k) {
		List<Integer> num2 = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		while (k > 0) {
			int rem = k % 10;
			num2.add(0, rem);
			k /= 10;
		}
	
		int min = Math.min(num1.length, num2.size());
		int carry = 0;
		int i = num1.length - 1;
		int j = num2.size() - 1;
		while (min > 0) {
			int sum = carry + num1[i] + num2.get(j);
			ans.add(0, sum % 10);
			carry = sum / 10;
			i--;
			j--;
			min--;
		}
		while (i >= 0) {
			int sum = num1[i] + carry;
			ans.add(0, sum % 10);
			carry = sum / 10;
	
			i--;
		}
		while (j >= 0) {
			int sum = num2.get(j) + carry;
			ans.add(0, sum % 10);
			carry = sum / 10;
	
			j--;
		}
		 
		if (carry > 0) {
			ans.add(0,carry);
		}
	
		return ans;
	} */
	   

	public static List<Integer> addToArrayForm(int[] num1, int k) {
		List<Integer> ans = new ArrayList<>();
		int i = num1.length - 1;
		int carry = 0;

		while (i >= 0 || k > 0) {
			int n1 = (i >= 0) ? num1[i] : 0;
			int n2 = k % 10;

			int sum = n1 + n2 + carry;
			ans.addFirst(sum % 10);
			carry = sum / 10;

			k /= 10;
			i--;
		}

		if (carry > 0) {
			ans.addFirst(carry);
		}

		return ans;
	}

	public static void main(String[] args) {
		// int[] num = {2, 7, 4};int k = 181;
		// int[] num = {1,2,0,0};int k = 34;
		int[] num = { 2, 1, 5};int k = 806;
		List<Integer> ll = addToArrayForm(num, k);
		System.out.println(ll);
	}
}
