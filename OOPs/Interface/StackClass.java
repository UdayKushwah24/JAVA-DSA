package OOPs.Interface;

public class StackClass implements Stack1 {

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int pop() {
        // Stack1.x += 10;
        System.out.println(Stack1.x);
        return 0;
    }

    @Override
    public void push() {

    }
    
}
