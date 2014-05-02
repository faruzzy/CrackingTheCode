public class Node {
	
	Node next;
	int data;

	public Node(int d) {
		data = d;
	}

	public void appendToTail(int d) {
		Node head = this;
		Node end = new Node(d);

		while (head.next != null) {
			head = head.next;
		}

		head.next = end;
	}
}