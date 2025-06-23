package LinkedList;

public class IntersectionLL_160 {
    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode f1 = headA;
        ListNode f2 = headB;
        while (f1 != f2) {
            if (f1 == null) {
                f1 = headB;
            } else {
                f1 = f1.next;
            }
            if (f2 == null) {
                f2 = headA;
            } else {
                f2 = f2.next;
            }
        }
        return f1;
    }
}
