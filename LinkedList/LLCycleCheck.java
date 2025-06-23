package LinkedList;

public class LLCycleCheck extends LinkedList {
    public static void main(String[] args) throws Exception{
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
        System.out.println(hasCycle(head));
    }
    
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
