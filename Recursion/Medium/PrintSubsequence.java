//Ques : Print all subsequences of string.

package Recursion.Medium;

public class PrintSubsequence {

    public static void subsequences(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subsequences(str.substring(1), ans);
        subsequences(str.substring(1), ans+ch);



    }
    public static void main(String[] args) {
        String str = "abcd";
        subsequences(str, "");
    }
}
