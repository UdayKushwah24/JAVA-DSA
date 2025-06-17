package Leetcode.Stack;

import java.util.*;

public class ReverseSubStringParenthesis_1190 {
/* 
public static String reverseParentheses(String s) {
Stack<Character> stack = new Stack<>();
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == ')') {
        String temp = "";
        while (!stack.isEmpty() && stack.peek() != '(') {
            temp = temp + stack.pop();
        }
        // System.out.println(temp);
        if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
        }
        for (int j = 0; j < temp.length(); j++) {
            stack.push(temp.charAt(j));
        }

    }
    stack.push(s.charAt(i));
}
// System.out.println(stack);
String ans = "";
// while (!stack.isEmpty()) {
//     if (!stack.isEmpty() && stack.peek() >= 'a' && stack.peek() <= 'z') {
//         ans = stack.pop() + ans;
//     }
// }
for (char ch : stack) {
    if (ch != ')') {
        
        ans = ans + ch;
    }
}
// System.out.println(ans);

return ans;
} */
   
    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                StringBuilder temp = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    temp.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                for (int j = 0; j < temp.length(); j++) {
                    stack.push(temp.toString().charAt(j));
                }

            }
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        
        for (char ch : stack) {
            if (ch != ')') {
            sb.append(ch);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        // String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
    }
}
