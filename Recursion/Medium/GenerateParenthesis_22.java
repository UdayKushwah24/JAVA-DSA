package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis_22 {

    // public static void generateParenthesis(int n,int closed,int open,String str) {
    //     if(open == n && closed == n) {
    //         System.out.println(str);
    //         return;
    //     }
    //     if(open > n || closed > open) {
    //         return ;
    //     }
    //     generateParenthesis(n, closed, open+1, str+"(");
    //     generateParenthesis(n, closed+1, open, str+")");
    // } 

    // public static void main(String[] args) {
    //     int n = 5;
    //     generateParenthesis(n,0,0,"");
    // }


    public static void Parenthesis(int n,int closed,int open,String str,List<String> lst) {
        if(open == n && closed == n) {
            lst.add(str);
            return;
        }
        // if(open > n || closed > open) {
        //     return ;
        // }
        // Parenthesis(n, closed, open+1, str+"(",lst);
        // Parenthesis(n, closed+1, open, str+")",lst);
        if(open < n) {
            Parenthesis(n, closed, open+1, str+"(", lst);
        } 
        if(closed < open) {
            Parenthesis(n, closed+1, open, str+")", lst);
        }
    } 

    public static void main(String[] args) {
        int n = 3;
        List<String> lst = new ArrayList<>();
        Parenthesis(n,0,0,"",lst);
        System.out.println(lst);
    }
    // public static void main(String[] args) {
    //     int n = 5;
    //     Parenthesis(n,0,0,"");
    // }
}
