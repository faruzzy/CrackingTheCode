/**
 * Given a circular linked list, implement an algorithm which
 * returns the node at the beginning of the loop.
 * 
 * Note: This solution will not compile.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		Node head = linkedList.head;
		Node runner = linkedList.head;

		
		while (runner != null && runner.next != null){
			head = head.next;
			runner = runner.next.next;
			if (head == runner) break;
		}

		// Error check, was there a llop in the linked list?
		if (runner == null || runner.next == null) return null;

		head = linkedList.head;

		while (head != runner) {
			head = head.next;
			runner = runner.next;
		}

		// Both pointers now point to the start of the loop
		return head;
	}
}