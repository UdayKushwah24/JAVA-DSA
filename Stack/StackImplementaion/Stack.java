/* 

pop
push
 peek
  size
 isFull
 isEmpty
  Display

*/

package Stack.StackImplementaion;

public class Stack {
    private int[] arr;
    private int idx = -1;
    public Stack() {
        arr = new int[5];
    }
    public Stack(int n) {
        arr = new int[n];
    }
    
    // isEmpty
    public boolean Isempty() {
        return idx == -1;
    }

    // Push : O(1)
    public void push(int ele) throws Exception{
        // if(idx > 4) {
            //     throw new Exception("Stacks overflow Error");
            // }
        if(Isfull()) {
            throw new Exception("Stacks overflow Error");
        }
        idx++;
        arr[idx] = ele;
    }

    // Size : O(1)
    public int size() {
        return idx+1;
    }

    // isFull : O(1)
    public boolean Isfull() {
        return idx == arr.length-1;
    }

    // pop : O(1)
    public int pop() throws Exception {
        if(Isempty()) {
            throw new Exception("Stack is Empty");
        }
        int rev = arr[idx];
        idx--;
        return rev;
    }

    // peek : O(1)
    public int peek() throws Exception{
        if(Isempty()) {
            throw new Exception("Stack is Empty");
        }
        int rev = arr[idx];
        return rev;
    }

    public void Display() {
        System.out.print("[");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i]+", ");
        }
        
        System.out.println(arr[idx]+"]");
    }
}