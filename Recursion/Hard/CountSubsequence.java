package Recursion.Hard;

public class CountSubsequence {

    // static int count = 0;
    // public static void subsequences(String str, String ans) {
    //     if(str.length() == 0) {
    //         System.out.print(ans+" ");
    //         count++;
    //         return;
    //     }
    //     char ch = str.charAt(0);
    //     subsequences(str.substring(1), ans);
    //     subsequences(str.substring(1), ans+ch);

    // }
    // public static void main(String[] args) {
    //     String str = "abcd";
    //     subsequences(str, "");
    //     System.out.println("\n"+count);
    // }


    public static int subsequences(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans+" ");
            return 1;
        }
        char ch = str.charAt(0);
        int a = subsequences(str.substring(1), ans);
        int b = subsequences(str.substring(1), ans+ch);
        return a+b;

    }
    public static void main(String[] args) {
        String str = "abcd";
        subsequences(str, "");
        System.out.println("\n"+subsequences(str, ""));
    }
}
