package LinkedList.LinkedListPrac;

public class LinkedList {
    class Node {
        int data;
        Node next;
    }
    private int size = 0;
    private Node head ;
    private Node tail ;
    public void AddFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if(size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }
    /* public void AddLast(int item) {
        Node nn = new Node();
        nn.data = item;
        if(size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    } */

    public void AddLast(int item) {
        if(size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void AddAtIndex(int item, int k) throws Exception{
        if(k == 0) {
            AddFirst(item);
        } else if(k == size) {
            AddLast(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            Node km1th = GetNode(k-1);
            nn.next = km1th.next;
            km1th.next = nn;
            size++;
        }
    }

    // O(n)
    private Node GetNode(int k) throws Exception {
        if(k < 0 || k >= size) {
            throw new Exception("Invalid Index");
        }
        Node temp = head;
        while (k-- > 0) {
            temp = temp.next;
        }
        return temp;
    }


    public int getFirst() {
        return head.data;
    }
    public int getLast() {
        return tail.data;
    }
    public int getAtIndex(int k) throws Exception{
        return GetNode(k).data;
    }




    public int removeFirst() {
        int rv = head.data;
        if(size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
        return rv;
    }
    public int removeLast() throws Exception{
        if(size == 1) {
            return removeFirst();
        } else {
            Node secondLast = GetNode(size-2);
            Node temp = tail;
            secondLast.next = null;
            tail = secondLast;
            size--;
            return temp.data;
        }
    }
    public int removeAtIndex(int k) throws Exception{
        if(k == 0) {
            return removeFirst();
        } else if(k == size-1) {
            return removeLast();
        } else {
            Node k_1th = GetNode(k-1);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next = null;
            size--;
            return kth.data;
        }
    }

    public int size(){
        return size;
    }

    // O(n)
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
}
