// Time Complexity : O(n)

package Recursion.Basic;

public class FactorialTail {

    public static int factorial(int n,int ans) {
        if(n == 0){
            return ans;
        }

        return factorial(n-1, n*ans);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n,1));
    }
}
