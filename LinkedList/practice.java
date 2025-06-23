package LinkedList;

public class practice extends LinkedList {

    public static Node Middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node MergeListSort(Node headA, Node headB) {
        Node dummy = new Node();
        Node temp = dummy;
        while (headA != null && headB != null) {

            if (headA.data < headB.data) {
                dummy.next = headA;
                dummy = dummy.next;
                headA = headA.next;
            } else {
                dummy.next = headB;
                dummy = dummy.next;
                headB = headB.next;
            }
        }
        if (headA == null) {
            dummy.next = headB;
        }
        if (headB == null) {
            dummy.next = headA;
        }
        return temp.next;
    }

    public static Node SortList(Node node) {

        if (node == null || node.next == null) {
            return null;
        }
        Node mid = Middle(node);
        Node midNext = mid.next;
        mid.next = null;
        Node a = SortList(mid);
        Node b = SortList(midNext);
        return MergeListSort(a, b);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        // ll.AddLast(7);
        ll.Display();

        System.out.println(Middle(head));


    }
}
