package Functions;
import java.util.Scanner;
public class prime {
    public static void Prime_Checker(int num){
        int count = 0;
        for(int i = 2;i<=num;i++){
            if(num%i==0){
                count = count + 1;
            }
        }
        if(count == 1) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        Prime_Checker(num);
        sc.close();
    }
}
/* 
package Functions;

public class Prime_in_ranges {
    public static boolean isPrime(int n){
        boolean isprime = true;
        // if(n == 2){
        //     return true;
        // }
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                isprime = false;
            }
        }
        return isprime;

    }
    public static void main(String[] args) {
        System.out.println(isPrime(45));
    }
}

 */

