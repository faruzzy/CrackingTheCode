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

		while (head != runner){
			head = head.next;
			runner = runner.next.next;
		}

		head = linkedList.head;

		while (head != runner) {
			head = head.next;
			runner = runner.next;
		}

		return head;
	}
}