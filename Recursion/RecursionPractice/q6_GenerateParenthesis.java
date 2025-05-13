package Recursion.RecursionPractice;

import java.util.ArrayList;
import java.util.List;

public class q6_GenerateParenthesis {
   /*  public static void GenerateParenthesis(int n, int open, int close, String ans) {
        if(open == n && close == n) {
            System.out.println(ans);
            return;
        }
        if (close > open) {
            return;
        }
        if(open > n || close > n) {
            return;
        }
         
        GenerateParenthesis(n, open+1, close, ans+"(");
        GenerateParenthesis(n, open, close+1, ans+")");
    } */


    public static void GenerateParenthesis(List<String> lst,int n, int open, int close, String ans) {
        if(open == n && close == n) {
            lst.add(ans);
            return;
        }
        if(close > open) return;
        if(open < n) {
            GenerateParenthesis(lst,n, open+1, close, ans+"(");
        }
        if (close < n) {
            GenerateParenthesis(lst,n, open, close+1, ans+")");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> lst = new ArrayList<>();
        GenerateParenthesis(lst,n , 0, 0, "");
        System.out.println(lst);
    }
}
