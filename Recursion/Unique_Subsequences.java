package Recursion;

import java.util.HashSet;

public class Unique_Subsequences {
    public static void uniqueSubsequences (String str, int ind, String newString,HashSet<String> set){
        if(ind == str.length()){
           if(set.contains(newString))
           return;
        else {
            System.out.println(newString);
            set.add(newString);
            return;
        }
        }
        char curChar = str.charAt(ind);
        uniqueSubsequences(str, ind+1, newString+curChar,set);
        uniqueSubsequences(str, ind+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "cccc";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str,0,"",set);
    }
}
