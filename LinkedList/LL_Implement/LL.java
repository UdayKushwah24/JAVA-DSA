package LinkedList.LL_Implement;

public class LL {
    class Node {
        int data;
        Node next;
    }

    private int size;
    private Node head;
    private Node tail;

    // TC : O(1)
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

    // TC : O(1)
    public void AddLast(int item) {
        if (size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    // TC : O(n)
    public void AddAtIndex(int item, int i) throws Exception {
        if (i == 0) {
            AddFirst(item);
        } else if (i == size) {
            AddLast(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            Node k_1thnode = GetNode(i - 1);
            nn.next = k_1thnode.next;
            k_1thnode.next = nn;
            size++;
        }
    }

    // TC : O(k)
    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Invalid Index !!!");
        }
        Node temp = head;
        int j = 0;
        while (j < k) {
            temp = temp.next;
            j++;
        }
        return temp;
    }

    // TC : O(1)
    public int GetFirst() {
        return head.data;
    }

    // TC : O(1)
    public int GetLast() {
        return tail.data;
    }

    // TC : O(n)
    public int GetAtIndex(int i) throws Exception {
        return GetNode(i).data;
    }

    // TC : O(1)
    public int removeFirst() {
        int rv = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rv;
    }

    // TC : O(n)
    public int removeLast() throws Exception {
        int rv = head.data;
        if (size == 1) {
            return removeFirst();
        } else {
            Node k_2thnode = GetNode(size - 2);
            k_2thnode.next = null;
            tail = k_2thnode;
            size--;
            return rv;
        }
    }

    public int removeAtIndex(int i) throws Exception {
        if (i == 0) {
            return removeFirst();
        } else if (i == size - 1) {
            return removeLast();
        } else {
            Node k_1thnode = GetNode(i - 1);
            Node kthnode = k_1thnode.next;
            k_1thnode.next = kthnode.next;
            kthnode.next = null;
            return k_1thnode.data;
        }
    }

    // TC : O(n)
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(".");
    }
}
