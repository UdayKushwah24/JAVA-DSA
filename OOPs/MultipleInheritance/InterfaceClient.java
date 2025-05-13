package OOPs.MultipleInheritance;

public class InterfaceClient implements DSAInterface {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void fun() {
        
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public void push() {
        
    }

    @Override
    public void Display() {
        
    }
    
    public static void main(String[] args) {
        InterfaceClient ic = new InterfaceClient();
        
    }

    
}
