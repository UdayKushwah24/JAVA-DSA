package LinkedList.LinkedListPrac;

public class LinkedList {
    class Node {
        int val;
        Node next;
    }

    private int size ;
    private Node head;
    private Node tail;

    public void AddFirst(int data) {
        Node nn = new Node();
        nn.val = data;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void AddLast(int data) {

        if (size == 0) {
            AddFirst(data);
        } else {
            Node nn = new Node();
            nn.val = data;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void AddAtIndex(int k, int data) {
        if (k == 0) {
            AddFirst(data);
        } else if (k == size) {
            AddLast(data);
        } else {
            Node nn = new Node();
            nn.val = data;
            Node k_1 = GetNode(k - 1);
            nn.next = k_1.next;
            k_1.next = nn;
            size++;
        }
    }

    public int getFirst() {
        return head.val;
    }
    
    public int getLast() {
        return tail.val;
    }

    public int getAtIndex(int k) {
        Node node = GetNode(k - 1);
        return node.val;
    }
    

    public int removeFirst() {
        if (size == 1) {
            int rv = head.val;
            head = null;
            tail = null;
            size--;
            return rv;
        } else {
            Node temp = head;
            int rv = head.val;
            head = head.next;
            temp = null;
            System.out.println(temp);
            size--;
            return rv;
        }
    }

    public int removeLast() {
        if (size == 1) {
            int rv = removeFirst();
            return rv;
        } else {
            Node temp = GetNode(size - 2);
            int rv = tail.val;
            tail.next = null;
            tail = temp;
            size--;
            return rv;
        }
    }

    
    public int removeAtIndex(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (k == size-1) {
            return removeLast();
        } else {
            Node k_1 = GetNode(k - 1);
            Node kth = k_1.next;
            int rv = kth.val;
            k_1.next = kth.next;
            kth = null;
            size--;
            return rv;
        }
    }
     
    
    public Node GetNode(int k) {
        
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
 }