package Leetcode.Stack;

import java.util.*;

public class MinRemoveMakeValidParenthesis_1249 {

  

    public static String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> index = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >='a' && ch <= 'z') {
                // stack.push(ch);
                continue;
            } else {
                stack.push(ch);
                index.push(i);
            }
        }
        String ans = "";
        Stack<Character> stack1 = new Stack<>();
        Stack<Integer> index1 = new Stack<>();
        while (!stack.isEmpty()) {
            ans = stack.pop()+ans;
        }

        for (int i = 0; i < ans.length(); i++) {
            char ch = ans.charAt(i);
            if(ch == '(') {
                stack1.push(ch);
            } else {
                if (stack.isEmpty()) {
                    
                }
            }
        }
        System.out.println(stack);
        System.out.println(index);
        return "";
        
    }   
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
}
