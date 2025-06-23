package LinkedList;

public class AddTwoNumbers_2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode Reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr.next != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headA = Reverse(l1);
        ListNode headB = Reverse(l2);
        int carry = 0;
        while (headA != null && headB != null) {
            
        }
    }

          
}
