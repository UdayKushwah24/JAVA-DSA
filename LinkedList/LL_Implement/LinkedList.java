package LinkedList.LL_Implement;

public class LinkedList {

    int size = 0;
    private Node head;
    private Node tail;

    class Node {
        int data;
        Node next;
    }

    public void AddFirst(int item) {
        Node nn = new Node();
        nn.data = item;

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

    public void AddLast(int item) {
        Node nn = new Node();
        if (size == 0) {
            AddFirst(item);
        } else {
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void AddAtIndex(int k, int item) {
        if (k == 0) {
            AddFirst(item);
        } else if (k == size) {
            AddLast(item);
        } else {
            Node nn = new Node();
            Node k_1thNode = GetNode(k - 1);
            Node k_thNode = k_1thNode.next;
            nn.data = item;
            nn.next = k_thNode;
            k_1thNode.next = nn;
            size++;
        }
    }

    public int GetFirst() {
        return head.data;
    }

    public int GetLast() {
        return tail.data;
    }

    public int GetAtIndex(int i) {
        return GetNode(i - 1).data;
    }

    public int RemoveFirst() {
        Node temp = head.next;
        int rv = head.data;
        head.next = null;
        head = temp;
        size--;
        return rv;
    }

    public int RemoveLast() {
        if (size == 1)
            return RemoveFirst();

        else {
            Node secondLast = GetNode(size - 2);
            int rv = tail.data;
            secondLast.next = null;
            size--;
            tail = secondLast;
            return rv;
        }
    }

    public int RemoveAtIndex(int k) {
        if (k == 1) {
            return RemoveFirst();
        } else if (k == size) {
            return RemoveLast();
        } else {
            Node k_1thNode = GetNode(k - 1);
            Node kth = k_1thNode.next;
            int rv = kth.data;
            k_1thNode.next = kth.next;
            kth.next = null;
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
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(".");
    }
}
