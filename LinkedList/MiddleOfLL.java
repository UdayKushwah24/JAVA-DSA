package LinkedList;

public class MiddleOfLL extends LinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddFirst(60);
        ll.AddFirst(50);
        ll.AddFirst(40);
        ll.AddFirst(30);
        ll.AddFirst(20);
        ll.AddFirst(10);
        // ll.AddFirst(10);
        ll.AddFirst(1);
        ll.Display();
        
        Node slow = head;
        Node fast = head;
        while (fast  != null && fast.next  != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);



    }
}
