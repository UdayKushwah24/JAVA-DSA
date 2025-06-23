package LinkedList;

public class CycleRemoval {

	class Node {
		int data;
		Node next;
	}

	private int size = 0;
	private Node head;
	private Node tail;

	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		while (k-- > 0) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void CreateCycle() throws Exception {
		Node nn = GetNode(2);
		tail.next = nn;
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}



	 

	// O(n^2)
	public void Cycle_Removal_1() {
		Node meet = hasCycle();
		if (meet == null) {
			System.out.println("No cycle");
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

	// O(n)
	public void Cycle_Removal_2() {
		Node meet = hasCycle();
		if (meet == null) {
			System.out.println("No cycle");
			return;
		}
		// length of cycle
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	// O(n)
	public void Floyed_Cycle_Removal() {
		Node meet = hasCycle();
		if (meet == null) {
			System.out.println("No cycle");
			return;
		}

		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public static void main(String[] args) throws Exception {
		CycleRemoval cl = new CycleRemoval();
		cl.AddLast(1);
		cl.AddLast(2);
		cl.AddLast(3);
		cl.AddLast(4);
		cl.AddLast(5);
		cl.AddLast(6);
		cl.AddLast(7);
		cl.AddLast(8);
		// cl.CreateCycle();
		// cl.Cycle_Removal_1();
		// cl.Cycle_Removal_2();
		// cl.Floyed_Cycle_Removal();
		cl.Display();

	}

}