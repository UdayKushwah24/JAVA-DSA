package Recursion.Medium;

public class StringPalindromePartition {
    // Palindrome Partition

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void PalindromePartition(String str, String partition) {
        if (str.length() == 0) {
            System.out.println(partition.substring(0, partition.length() - 1));
            return;
        }
        for (int i = 1; i <= str.length(); i++) {
            String s = str.substring(0, i);
            if (isPalindrome(s)) {
                PalindromePartition(str.substring(i), partition + s + "|");
            }
        }
    }

    public static void main(String[] args) {
        String str = "nitin";
        PalindromePartition(str, "");
    }
}
