// Time Complexity : O(n)

package Stack;

import java.util.Stack;

public class NextGreaterEle_CB {


   /* 

    public static void FindNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[stack.peek()]) {
                while (!stack.isEmpty()) {
                    arr[stack.pop()] = arr[i];
                }
            }
            stack.push(i);
            
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
    } 

    */


    public static int[] FindNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 50, 11, 9, 7, 13, 3 };
        int[] ans = FindNextGreater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " +ans[i]);
        }
    }                                                               
}
 