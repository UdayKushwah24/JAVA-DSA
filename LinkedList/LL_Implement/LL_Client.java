package LinkedList.LL_Implement;

public class LL_Client {
    public static void main(String[] args) throws Exception {
        LL ll = new LL();
        ll.AddFirst(40);
        ll.Display();
        ll.AddFirst(30);
        ll.AddFirst(20);
        ll.AddFirst(10);
        ll.AddLast(50);
        ll.Display();
        ll.AddAtIndex(100, 2);
        ll.Display();
        System.out.println(ll.removeFirst());
        ll.Display();
    }
}
