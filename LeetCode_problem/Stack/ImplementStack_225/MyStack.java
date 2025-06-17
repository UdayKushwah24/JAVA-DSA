package Leetcode.Stack.ImplementStack_225;

import java.util.*;

public class MyStack {
    List<Integer> ll = new ArrayList<>();
    int size = -1;
    public MyStack() {

    }

    public void push(int x) {
        ll.add(x);
        size++;
    }

    public int pop() {
        int rv = ll.remove(size);
        size--;
        return rv;
    }

    public int top() {
        return ll.get(size);
    }

    public boolean empty() {
        return size == -1;
    }
}
