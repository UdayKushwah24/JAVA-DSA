package OOPs.Inheritance;
// C -> Child class
public class C extends P {
    int d = 1;
    int d1 = 10;
 
    @Override  // --> annotation
    public void fun() {
        System.out.println("Fun in C");
    }
    public void fun1() {
        System.out.println("Fun1 in C");
    }
}
