package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning_131 {

   /*  public static boolean CheckPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void Partition(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String s =ques.substring(0,cut);
            if(CheckPalindrome(s)) {
                Partition(ques.substring(cut), ans+s+" ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "nitin";
        Partition(s, "");
    } */




    public static boolean CheckPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void Partition(String ques,List<List<String>> list,List<String> ll, String ans) {
        if(ques.length() == 0) {
            list.add(new ArrayList<String>(ll));
            // System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String s =ques.substring(0,cut);
            if(CheckPalindrome(s)) {
                ll.add(s);
                Partition(ques.substring(cut),list, ll, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        String s = "nitin";
        List<List<String>> list = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        Partition(s, list,ll,"");
        System.out.println(list);
    }
}
