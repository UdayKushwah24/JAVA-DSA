package Leetcode.Stack.MaxFrequencyStack_895;

import java.util.*;

public class FreqStack {
    int size = 0;
    List<Integer> ll = new ArrayList<>();
    int[] arr = new int[Integer.MAX_VALUE];
    public FreqStack() {

    }

    public void push(int val) {
        arr[val]++;
        ll.add(val);
        size++;
    }



    public int pop() {
        int max = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                num = i;
                max = Math.max(max, arr[i]);
            }
        }

        int rv = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (ll.get(i) == num) {
                rv = ll.remove(num);
                size--;
                break;
            }
        }
        
        return rv;
    }
}
