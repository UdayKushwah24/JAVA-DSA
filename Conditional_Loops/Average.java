package Conditional_Loops;
import java.util.Scanner;
public class Average {
    public static void average (int n) {
        String s = "" + n;
        int sum = 0;
        for (int i = 0; i < s.length() ; i++) {
            sum = sum + Character.getNumericValue(s.charAt(i));
        }
        // double answer = (double)summ/s.length();
        // System.out.println(summ);
        // System.out.println(s.length());
        System.out.println((double)sum/s.length());
    }
    public static void main(String[] args){
    System.out.print("Enter number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Call the static method with an argument
    average(n); 
    sc.close();
    }
} 

/*

s.charAt(i):

s: This is the string representation of the integer n that was passed to the average method.
.charAt(i): This method call retrieves the character at index i of the string s.
For example, if s is "123" and i is 0, then s.charAt(0) returns '1'.
Character.getNumericValue():

Character: This is a class in the Java Standard Library that contains methods for manipulating characters.
.getNumericValue(char ch): This method takes a character as an argument and returns the integer value that the character represents.
For example, if the input character is '1', the method returns 1.

*/


/*

int number = 123;
String str = "" + number;

int number = 123;
String str = Integer.toString(number);

int number = 123;
String str = String.format("%d", number);

*/