package Stack.StackImplementaion;

public class StackClient {
  
    public static void main(String[] args) throws Exception{
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.Display();
        System.out.println(st.size());
        System.out.println(st.Isfull());
        System.out.println(st.Isempty());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.Display();
        st.push(60);
        // st.push(80);
        st.Display();

    }
}
