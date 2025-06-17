package Leetcode.AllQuestion;

public class ComplexNumber_537 {
	public static String complexNumberMultiply(String num1, String num2) {
		int[] n1 = parse(num1);
		int[] n2 = parse(num2);

		int real = n1[0] * n2[0] - n1[1] * n2[1];
		int imag = n1[0] * n2[1] + n1[1] * n2[0];

		return real + "+" + imag + "i";
	}

	private static int[] parse(String s) {
		String[] parts = s.split("\\+|i");
		for (int i = 0; i < parts.length; i++) {
			System.out.print(parts[i] + " ");
		}
		System.out.println();
		int real = Integer.parseInt(parts[0]);
		int imag = Integer.parseInt(parts[1]);
		int[] arr = { real, imag };
		return arr;
	}
	public static void main(String[] args) {
		String num1 = "1+1i", num2 = "1+1i";
		complexNumberMultiply(num1, num2);
	}
}
