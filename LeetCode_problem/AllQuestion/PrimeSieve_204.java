package Leetcode.AllQuestion;

public class PrimeSieve_204 {

	public static void primeNum(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[i*j] = true;
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (!prime[i]) {
				System.out.print(i + " ");
			}
		}
		
	}
	public static void main(String[] args) {
		int n = 100;
		primeNum(n);
	}
}
