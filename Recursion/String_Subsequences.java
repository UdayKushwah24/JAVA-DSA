package Recursion;

public class String_Subsequences {
    public static void All_subsequences (String s, int ind, String newString){
        if(ind == s.length()){
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(ind);
        All_subsequences(s, ind+1, newString+currChar);
        All_subsequences(s, ind+1, newString);
    }
    public static void main(String[] args) {
        String s = "abcc";
        All_subsequences(s,0,"");
    }
}
