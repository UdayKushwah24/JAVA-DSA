/* package Recursion;
import java.util.Scanner;
public class Fibonacci {
    static void fibonacci (int a,int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last term : ");
        int num = sc.nextInt();
        sc.close();
        if(num>=1)
    }
    public static void main(String[] args) {
        
        fibonacci(0, 1);
    }
}
 */


package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci (int num){
        //base case
        if(num==0 || num == 1) {
            return num;
        }
        //Recursive work
        int pre = fibonacci(num-1);
        int prepre = fibonacci(num-2);
        //Self work
        return pre+prepre;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last term : ");
        int num = sc.nextInt();
        for(int i=0; i<num;i++){
            System.out.println(fibonacci(i));
        }
        sc.close();
    }
    
}
