package Recursion;
import java.util.Scanner;
public class Sum_up_to {
    static int Result (int num){
        if(num>0){
            return num+Result(num-1) ;
            
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int n = sc.nextInt();
        System.out.print(Result(n));
        sc.close();
    }
}
