package LinkedList.LinkedListImplementation;

public class LinkedList_Client {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.Display();
        System.out.println();
        ll.AddLast(100);
        ll.AddatIndex(-4, 2);
        ll.AddatIndex(-40, 2);
        ll.Display();
        System.out.println();
        System.out.println(ll.GetFirst());
        System.out.println(ll.GetLast());
        System.out.println(ll.getIndex(3));
        System.out.println(ll.RemoveFirst());
        ll.AddFirst(40999);
        ll.Display();
        System.out.println(ll.RemoveLast());
        ll.Display();
        System.out.println(ll.RemoveAtIndex(2));
        ll.Display();
    }
}
