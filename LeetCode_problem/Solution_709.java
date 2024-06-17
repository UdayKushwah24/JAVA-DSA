/* package LeetCode_problem;
import java.util.Scanner;
public class Solution_709 {
    static String ToLowerCase(String s){
        // return s.toLowerCase();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90){
                c[i] = (char)(c[i]+32);
            }
        }
        return String.valueOf(c);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.println(ToLowerCase(s));
        sc.close();
    }
} */


/* 
string.length() function is used to calculate the length of string.
Char_array.length function is used to calculate the length of Character array.
*/



package LeetCode_problem;
import java.util.Scanner;
public class Solution_709 {
    static String ToLowerCase(String s){
        // return s.toLowerCase();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90){
                c[i] = (char)(c[i]+32);
            }
        }
        return String.valueOf(c);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.println(ToLowerCase(s));
        sc.close();
    }
}