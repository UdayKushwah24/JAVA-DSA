/* 
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

constraint :
without using the linkedlist size.
 */

package LinkedList;
 
public class Middle_LL {

    // Leetcode
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
  



    // Using LinkedList Implementation
 /*    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);
        ll.AddFirst(60);
        ll.Display();
        // System.out.println(ll.Size());
        System.out.println();
        System.out.println(ll.GetFirst());
        int s = ll.Size();
        if(s % 2 == 0) {
            s = (int)(s/2);
            System.out.println(ll.getIndex(s));
        } else {
            s = s/2;
            System.out.println(ll.getIndex(s));
        }
    } */
}
