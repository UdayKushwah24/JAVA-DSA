package OOPs.Genrics;

public class GenricLinkedList<T> {

    class Node {
        T data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // TC : O(1)
    public void AddFirst(T item) {
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
    public void AddLast(T item) {
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
    public void AddatIndex(T item, int k) throws Exception {
        if (k == 0) {
            AddFirst(item);
        } else if (k == size) {
            AddLast(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            Node prev = GetNode(k - 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }

    // TC : O(1)
    public T GetFirst() {
        return head.data;
    }

    // TC : O(1)
    public T GetLast() {
        return tail.data;
    }

    // TC : O(n)
    public T getIndex(int i) throws Exception {
        return GetNode(i).data;
    }

    // TC : O(1)
    public T RemoveFirst() {
        T rem = head.data;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
        return rem;
    }

    // TC : O(n)
    public T RemoveLast() throws Exception {
        if (size == 1) {
            size--;
            return RemoveFirst();
        } else {
            T rem = tail.data;
            Node prev = GetNode(size - 2);
            prev.next = null;
            tail = prev;
            size--;
            return rem;
        }
    }

    // TC : O(1)
    public T RemoveAtIndex(int k) throws Exception {
        if (k == 0) {
            size--;
            return RemoveFirst();
        } else if (k == size) {
            size--;
            return RemoveLast();
        } else {
            size--;
            Node pre = GetNode(k - 1);
            Node curr = pre.next;
            pre.next = curr.next;
            curr.next = null;
            return curr.data;
        }
    }

    public int Size() {
        return size;
    }

    // TC : O(n)
    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Invalid Index..");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // TC : O(n)
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        GenricLinkedList<String> ll = new GenricLinkedList<>();
        ll.AddLast("Ankit");
        ll.AddLast("Ankita");
        ll.AddLast("Puneet");
        ll.AddLast("Bobby");
        ll.AddLast("Kaju");
        ll.AddLast("Ram");

        ll.Display();

        System.out.println();
        GenricLinkedList<Integer> ll1 = new GenricLinkedList<>();
        ll1.AddLast(1);
        ll1.AddLast(2);
        ll1.AddLast(4);
        ll1.AddLast(5);
        ll1.AddLast(6);
        ll1.AddLast(8);

        ll1.Display();
    }
}
