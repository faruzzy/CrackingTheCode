/**
 * Implement an algorithm to find the kth last element of a singly linked list.
 */
public class InterviewPractice {
	
	public static void main(String[] args) {
		Node list = new Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(5);
		list.appendToTail(6);
		list.appendToTail(7);
		list.appendToTail(8);
		list.appendToTail(9);
		list.appendToTail(10);

		printList(list);
		elementPositionFromTail(list, 1);
		elementPositionFromTail(list, 2);
		elementPositionFromTail(list, 3);
		elementPositionFromTail(list, 4);

	}

	public static void printList(Node list) {
		while (list != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}
		System.out.print("\n");
	}

	public static void elementPositionFromTail(Node list, int k) {
		Node runner = list;

		// Remark: Error check regarding whether kth element exists reccomended - need list size
		for (int i = 0; i < k - 1; i++) {
			runner = runner.next;
		}

		while (runner.next != null) {
			runner = runner.next;
			list = list.next;
		}

		System.out.println("The " + k + "th" + " element is: " + list.data);
	}
}