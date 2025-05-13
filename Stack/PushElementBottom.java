package Stack;

import java.util.Stack;

public class PushElementBottom {

    public static void Add_Last(Stack<Integer> st, int item) {
        if(st.isEmpty()) {
            st.push(item);
            return;
        }
        int x = st.pop();
        Add_Last(st, item);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st);
        Add_Last(st, 10);
        System.out.println(st);
    }        
            
}
