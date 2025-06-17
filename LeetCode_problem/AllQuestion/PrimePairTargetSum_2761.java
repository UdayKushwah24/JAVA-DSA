package Leetcode.AllQuestion;

import java.util.*;
public class PrimePairTargetSum_2761 {


	public static List<Integer> primeNum(int n) {
		boolean[] prime = new boolean[n + 1];
		List<Integer> ll = new ArrayList<>();
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[i * j] = true;
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (!prime[i]) {
				ll.add(i);
			}
		}
		return ll;

	}

	public static List<List<Integer>> findPrimePairs(int n) {
		List<Integer> ll = primeNum(n);
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < ll.size(); i++) {
			int rem = n - ll.get(i);
			for (int j = i; j < ll.size(); j++) {
				if (rem == ll.get(j)) {
					List<Integer> pair = new ArrayList<>();
					pair.add(ll.get(i));
					pair.add(rem);
					ans.add(pair);
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int n = 10;
		// List<Integer> ll = primeNum(n);
		// System.out.println(ll);
		List<List<Integer>> ans = findPrimePairs(n);
		System.out.println(ans);
	}
}
