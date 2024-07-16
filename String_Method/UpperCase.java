/* 
Input : hello, i am quick learner in java.
Output: Hello, I Am Quick Learner In Java.
 */

// Time Complexity = O(n)    where n is length of a string

package String;

public class UpperCase {
    public static void ToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(char i = 1;i < str.length();i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } 
            else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "hello, i am quick learner in java.";
        ToUpperCase(str);
    }
}
