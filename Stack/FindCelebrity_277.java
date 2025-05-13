// Leetcode Problem : 277
// https://leetcode.ca/all/277.html

package Stack;

import java.util.Scanner;
import java.util.Stack;
 
public class FindCelebrity_277 {
    public static int FindCelebrity(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if(arr[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        int celebrity = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if(celebrity == i) {
                continue;
            }
            if(arr[celebrity][i] == 1 ||  arr[i][celebrity] == 0) {
                return -1;
            }
        }
        return celebrity;
    }
    public static void main(String[] args) {
        // int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][ j] = sc.nextInt();
            }
        }
        System.out.println(FindCelebrity(arr));
    } 
}
