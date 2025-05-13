package Recursion.Hard;

public class Permutation {

  /*   public static void PrintPermutation(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i+1);
            PrintPermutation(s1+s2, ans+ch);
        }
    }
    public static void main(String[] args) {
        String ques = "abc";
        PrintPermutation(ques,"");
    } */


    /* public static int CountPermutation(String ques, String ans) {
        if(ques.length() == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i+1);
            count += CountPermutation(s1+s2, ans+ch);
        }
        return count;
    }
    public static void main(String[] args) {
        String ques = "abc";
        
        System.out.println(CountPermutation(ques,""));
    } */



    /* public static boolean isValid(String str,int i,char ch){
        for (int j = i; j < str.length(); j++) {
            if(str.charAt(j) == ch) {
                return true;  //mil gaya tho true
            }
        }
        return false;
    }

    public static void DuplicatePermutation(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return ;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if(!isValid(ans, i+1, ch)) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i+1);
                DuplicatePermutation(s1+s2, ans+ch);
            }
        }
    }
    public static void main(String[] args) {
        String ques = "abca";
        
        DuplicatePermutation(ques,"");
    } */













    public static void DuplicatePermutation(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return ;
        }
        for (int i = 0; i < ques.length(); i++) {
            boolean val = true;
            char ch = ques.charAt(i);
            for (int j = i+1; j < ques.length(); j++) {
                if(ques.charAt(j) == ch) {
                    val = false;
                    break;
                }
            }
            if(val) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i+1);
                DuplicatePermutation(s1+s2, ans+ch);
            }
        }
    }
    public static void main(String[] args) {
        String ques = "abca";
        
        DuplicatePermutation(ques,"");
    }
}



