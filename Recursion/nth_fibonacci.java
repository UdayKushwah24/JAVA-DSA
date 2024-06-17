package Recursion;
import java.util.Scanner;

public class nth_fibonacci {
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
            System.out.println(fibonacci(num));
            sc.close();
        }
        
}
      

