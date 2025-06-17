package Leetcode.Stack.StackIncrementOper_1381;

public class CustomStack {
    int size = 0;
    int[] arr;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (size < arr.length) {
            arr[size++] = x;
        }
    }

    public int pop() {
        if (size > 0) {
            int rv = arr[size - 1];
            size--;
            return rv;
        }
        return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, size); i++) {
            arr[i] = arr[i] + val;
        }
    }
}
