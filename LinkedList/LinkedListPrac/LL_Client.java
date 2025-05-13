package LinkedList.LinkedListPrac;

public class LL_Client {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.Display();
        // ll.AddLast(70);
        // ll.AddLast(80);
        // ll.AddLast(90);
        // ll.Display();
        // //  System.out.println(ll.head.data);
        // //  System.out.println(ll.tail.data);
        // ll.AddAtIndex(5, 0);
        // ll.Display();
        // ll.AddAtIndex(500, 2);
        // ll.AddAtIndex(600, 2);
        // ll.Display();
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());
        // System.out.println(ll.getAtIndex(3));
        // ll.Display();
        // System.out.println(ll.removeFirst());
        // ll.Display();

        // System.out.println(ll.removeLast());
        // ll.Display();
        // System.out.println(ll.removeLast());
        // ll.Display();
        // System.out.println(ll.removeLast());
        // ll.Display();
        // System.out.println(ll.removeLast());
        // ll.Display();
        System.out.println(ll.removeAtIndex(2));
        ll.Display();
        
    }

}
