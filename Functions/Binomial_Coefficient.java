package Functions;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int binomialCoefficient(int n,int r){
        //C(n, r) = n! / (r!(n-r)!)
        int N = fact(n);
        int R = fact(r);
        int nmr = fact(n-r);
        int ans = (N/(R*nmr));
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        int answer = binomialCoefficient(n,r);
        System.out.println(answer);
        sc.close();
    }
}
