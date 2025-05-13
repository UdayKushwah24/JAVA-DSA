package OOPs.Interface;

public interface Stack1 {

    public void push();

    public int pop();

    public  int peek();
    
    public static final int x = 8;  //  int x = 8;   



    // java 8
    // static method ko body de sakte hai
    static void f1() {
        
    }
    // default method ko body de sakte hai
    default void f2() {
        
    }
    
    // java 9  private method ko body de sakte hai
    private void name() {

    }
}
