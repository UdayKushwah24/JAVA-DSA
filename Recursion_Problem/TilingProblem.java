/* 
Given a "2xn" board and tiles of size "2x1" count the nunmber of ways to tile the given board using "2x1" tiles.
(A tile can either be placed horizontal or vertical)
 */
package Recursion_Problem;

public class TilingProblem {
    public static int tileProblem(int n){   //2 x n (n is floor size)
        //Base case
        if(n == 1 || n == 0) {
            return 1;
        }

        //Vertical Choices
        int fnm1 = tileProblem(n-1);

        //Horizontal Choices
        int fnm2 = tileProblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(tileProblem(n));
    }
}
