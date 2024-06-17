/* 
Write a function to find if a number is a palindrome or not. Take number as parameter.
 */
package Functions;
import java.util.Scanner;
public class Palindrome {
    static String Check_palindrome(int num){
        String originalString = ""+num;
        String reversedString = new StringBuilder(originalString).reverse().toString();
        if(originalString.equals(reversedString)){
            // System.out.println("Palindrome");
            return "Palindrome";
        }
        else{
            // System.out.println("Not Palindrome");
            return "Not Palindrome";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(Check_palindrome(num));
        sc.close();
    }

}

/* 
String str1 = new String("hello");
String str2 = new String("hello");

if (str1 == str2) {
    System.out.println("str1 and str2 are the same object");
} else {
    System.out.println("str1 and str2 are different objects");
}

if (str1.equals(str2)) {
    System.out.println("str1 and str2 have the same content");
} else {
    System.out.println("str1 and str2 have different content");
}
 */