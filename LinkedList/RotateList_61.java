package LinkedList;

public class RotateList_61 extends LinkedList {
    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.Display();

        int k = 2;
        
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        k = k % count;
        System.out.println(count);
        int newHead = count - k - 1;
        temp = head;
        Node start = temp;
        for (int i = 0; i < newHead; i++) {     
            temp = temp.next;
        }
        // Node sl = temp.next;
        // temp.next = null;
        // while (sl != null) {
        //     sl = sl.next;
        // }
        // sl.next = start;
        // head = sl;
        // ll.Display();
        Node sl = temp.next;
        temp.next = null;

        Node tail = sl; // we need to find last node of second half
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head; // connect tail to original head
        head = sl; // new head is sl
        ll.Display();
    }
}
