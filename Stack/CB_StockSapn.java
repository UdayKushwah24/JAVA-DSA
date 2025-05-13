// URL : https://codeskiller.codingblocks.com/problems/502

package Stack;
 
import java.util.Stack;

public class CB_StockSapn {
    public static void NextGreaterElement(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ans.length; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            // calculate span 
            if(stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i-stack.peek();
            }
            stack.push(i);
        }
        
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" -> "+ans[i]);
        }
    }
    public static void main(String[] args) {
        // int[] arr = {73,74,75,71,69,72,76,73};
        int[] arr = {50, 3, 4, 8, 9};
        NextGreaterElement(arr);
    }
}
