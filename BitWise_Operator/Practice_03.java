/* 
Write a java program to encrypt a grade by adding 8 to it . 
Decrypt it to show the correct grade ?
*/
package BitWise_Operator;
import java.util.Scanner;
public class Practice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single Character : ");
        char a = sc.next().charAt(0);
        //encrypt the grade
        a = (char)(a+8);
        System.out.println(a);
        //decrypt the grade
        a = (char)(a-8);
        System.out.println(a);
        sc.close();
    }
}
