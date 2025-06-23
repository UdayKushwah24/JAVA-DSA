package LinkedList;

public class PalindromeLL_234 extends LinkedList {

    public static Node Reverse(Node node) {
        Node curr = node;
        Node prev = null;
        while (curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    public static Node middleNode(Node node) {
        Node slow = node;
        Node fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome(Node node) {
        if (node == null || node.next == null)
            return true;

        Node mid = middleNode(node);
        Node secondHalfStart = mid.next;
        mid.next = null;

        Node rev = Reverse(secondHalfStart);
        Node first = node;

        while (first != null && rev != null) {
            System.out.println(first.data + " " + rev.data);
            if (first.data != rev.data)
                return false;
            first = first.next;
            rev = rev.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddLast(1);
        ll.AddLast(1);
        // ll.AddLast(3);
        // ll.AddLast(4);
        // // ll.AddLast(4);
        // ll.AddLast(3);
        // ll.AddLast(2);
        // ll.AddLast(1);
        ll.Display();
        System.out.println(isPalindrome(head));
        // System.out.println(middleNode(head));
        // head = Reverse(head);
        // ll.Display();b

    }
}
