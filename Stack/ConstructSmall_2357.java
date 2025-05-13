package Stack;
import java.util.*;
public class ConstructSmall_2357 {

    public static void Construct_Small_Number(String str){
        Stack<Integer> st  = new Stack<>();
        int[] ans = new int[str.length()+1];
        int count = 1;
        for (int i = 0; i <= str.length(); i++) {
            if(i == str.length() || str.charAt(i) == 'I') {
                ans[i] = count;
                count++;
                while(!st.isEmpty()) {
                    ans[st.pop()] = count;
                    count++;
                }
            } else {
                st.push(i);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        // String pattern = "IIIDIDDD";
        // String pattern = "IIIDIDDI";
        String pattern = "IIDDII";
        Construct_Small_Number(pattern);

    }
}
