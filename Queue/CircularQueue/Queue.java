package Queue.CircularQueue;

public class Queue {
    private int[] arr;
    private int front = 0;
    private int size = 0;

    // constructor
    public Queue() {
        arr = new int[5];
    }

    public Queue(int n) {
        arr = new int[n];
    }

    // isEmpty
    public boolean Isempty() {
        return size == 0;
    }

    // isFull
    public boolean Isfull() {
        return size == arr.length - 1;
    }

    // Equeue means add element
    public void Equeue(int item) {
        int idx = (front + size);
        arr[idx] = item;
        size++;
    }

    // Dequeue means remove element
    public int Dequeue() {
        int rem = arr[front];
        front++;
        size--;
        return rem;
    }

    // Dequeue means remove element
    public int GetFront() {
        int rem = arr[front];
        return rem;
    }

    // size
    public int size() {
        return size;
    }

    // display queue element
    public void Display() {
        for (int i = front; i < (size+front); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
