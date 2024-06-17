/* package Recursion;
import java.util.Scanner;
public class Factorial {
    static int factorial (int num){
        //base case or halting case
        if(num == 0) return 1;
        else{
            //self work + recursive work
           return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}

 */


package Recursion;
import java.util.Scanner;
public class Factorial {
    static int factorial (int num){
        //base case or halting case
    if(num == 0) return 1;
        //small problem or recursive work
    int small_work = factorial(num-1);
    //solution for big problem + self work
    return num * small_work;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}
 
 