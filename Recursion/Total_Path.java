/* 
Count total paths in a maze to move from (0,0) to (n,m)
    n = 3 ; n = 4
Condition -> 1. Only move in right direction
             2. Only move in downward direction
 */
package Recursion;

public class Total_Path {
    public static int Count_Paths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downpaths = Count_Paths(i+1, j, n, m);

        //move right
        int rightpaths = Count_Paths(i, j+1, n, m);

        return rightpaths+downpaths;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        System.out.println(Count_Paths(0, 0, n, m));
    }
}
