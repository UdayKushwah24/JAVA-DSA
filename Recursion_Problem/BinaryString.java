/* 
Print all Binary strings of size N without consecutive ones.
 */
package Recursion_Problem;

public class BinaryString {
    public static void binarystr (int n, String newstr, int lastplace){
        if(n == 0){
            System.out.println(newstr);
            return;
        }
        if(lastplace == 0){
            binarystr(n-1, newstr+0, 0);
            binarystr(n-1, newstr+1, 1);
        }
        else {
            binarystr(n-1, newstr+0, 0);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int lastplace = 0;
        binarystr(n,"", lastplace);
    }
}
