package Basic;
/* Take two integers input , a and b : a> b and
 find the remainder when a is divided by b. */

import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        int c ;
        c = (a%b);
        System.out.println("The remainder when "+a+" is divided by "+b+" is "+c);
        sc.close();   
    }
}