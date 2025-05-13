// Ques : print all binary strings of size N without consecutive ones
/* Input : 4
   Output :  0000
             0001
             0010
             0100
             0101
             1000
             1001
             1010

 */

package Recursion.Medium;

public class BinaryNumber {

    //Print all Binary string
    /* public static void Binary(int n,String ans) {
        if(n == 0) {
            System.out.println(ans);
            return;
        }
        Binary(n-1, ans+"0");
        Binary(n-1, ans+"1");
    } */


    // no two 1's come together
    public static void Binary(int n,String ans) {
        if(n == 0) {
            System.out.println(ans);
            return;
        }
        Binary(n-1, ans+"0");
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != '1') {
            Binary(n-1, ans+"1");
        }
    }
    public static void main(String[] args) {
        int n = 4;
        Binary(n, "");
    }
}
