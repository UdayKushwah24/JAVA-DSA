package Recursion.RecursionPractice;

public class q2_Subsequences {
    public static void main(String[] args) {
        String s = "abc";
        Subsequence(s, "");
    }

    public static void Subsequence(String s, String string) {
        if(s.length() == 0) {
            System.out.print(string+" ");
            return;
        }
        char ch = s.charAt(0);
        Subsequence(s.substring(1), string);
        Subsequence(s.substring(1), string+ch);
    }
}
