package Leetcode.AllQuestion;

public class PrimeNumberSetBit_762 {
	public static boolean CheckPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

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

	public static int countPrimeSetBits(int left, int right) {
		int count = 0;
		for (int i = left; i <= right; i++) {
			if (CheckPrime(countBit(i))) {
				count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		int left = 10;
		int right = 15;
		System.out.println(countPrimeSetBits(left, right));
	}
}
