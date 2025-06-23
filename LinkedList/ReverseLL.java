package LinkedList;

public class ReverseLL extends LinkedList {
    /* public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddFirst(60);
        ll.AddFirst(50);
        ll.AddFirst(40);
        ll.AddFirst(30);
        ll.AddFirst(20);
        ll.AddFirst(10);
        ll.AddFirst(1);
        // ll.CreateCycle();
        ll.Display();
        System.out.println();
        head =  Reverse1(head,null);
        ll.Display();
    }

    public static Node Reverse1(Node curr, Node prev) {
        if (curr == null) {
            return prev;
        }
        Node temp = Reverse1(curr.next, curr);
        curr.next = prev;
        return temp;
    }
} */


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddFirst(60);
        ll.AddFirst(50);
        ll.AddFirst(40);
        ll.AddFirst(30);
        ll.AddFirst(20);
        ll.AddFirst(10);
        ll.AddFirst(1);
        // ll.CreateCycle();
        ll.Display();
        System.out.println();
        head =  Reverse1(head);
        ll.Display();
    }

    public static Node Reverse1(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
