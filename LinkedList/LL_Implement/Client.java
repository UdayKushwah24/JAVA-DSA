package LinkedList.LL_Implement;

public class Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        // ll.Display();
        // ll.AddLast(50);
        // ll.AddLast(60);
        // ll.Display();
        // ll.AddAtIndex(2,100);
        
        ll.Display();
        System.out.println(ll.size);
        ll.AddAtIndex(4,200);
        ll.Display();
        // System.out.println(ll.GetFirst());
        // System.out.println(ll.GetLast());
        // System.out.println(ll.GetAtIndex(0));
        // System.out.println(ll.GetAtIndex(5));
        // System.out.println(ll.RemoveFirst());
        // ll.Display();
        // System.out.println(ll.RemoveFirst());
        // ll.Display();
        System.out.println(ll.size);
        // System.out.println(ll.RemoveLast());
        ll.Display();
        System.out.println(ll.RemoveAtIndex(2));
        ll.Display();

    }
}
