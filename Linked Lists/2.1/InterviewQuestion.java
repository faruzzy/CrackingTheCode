import java.util.HashMap;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * How would you solve this problem if a temporary buffer is not allowed.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		// Build a simple linked list
		Node list = new Node(1);
		list.appendToTail(5);
		list.appendToTail(4);
		list.appendToTail(1);
		list.appendToTail(4);
		list.appendToTail(9);
		list.appendToTail(9);

		printList(list);
		removeDuplicatesNoStorage(list);
		printList(list);
		removeDuplicatesStorage(list);
		printList(list);


	}

	public static void printList(Node head) {
		Node printList = head;
		while (printList != null) {
			System.out.print(printList.data + " ");
			printList = printList.next;
		}
		System.out.print("\n");
	}

	/**
	 * Removes duplicates without the use of additional storage.
	 */
	public static void removeDuplicatesNoStorage(Node head) {
		// Error check
		if (head == null) return;

		while (head != null) {
			// Here we set runner equal to head because anything before head is not duplicated.
			Node runner = head;
			while (runner.next != null) {
				if (runner.next.data == head.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			head = head.next;
		}
	}

	public static void removeDuplicatesStorage(Node head) {
		if (head == null) return;

		HashMap<Integer,Boolean> hashMap = new HashMap<Integer,Boolean>();
		hashMap.put(head.data, true);

		while (head.next != null) {
			if (hashMap.containsKey(head.next.data)) {
				head.next = head.next.next;
			} else {
				head = head.next;	
				hashMap.put(head.data, true);
			}
		}
	}
}