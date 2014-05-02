import java.util.LinkedList;

/**
 * Write a function that adds two numbers stores in a linked list
 * in reverse order and returns the sum as a linked list.
 */
public class InterviewPractice {
	
	private static LinkedList<Integer> result = new LinkedList<Integer>();

	public static void main(String[] args) {
		LinkedList<Integer> firstOperand = new LinkedList<Integer>();
		firstOperand.add(7);
		firstOperand.add(1);
		firstOperand.add(6);

		LinkedList<Integer> secondOperand = new LinkedList<Integer>();
		secondOperand.add(5);
		secondOperand.add(9);
		secondOperand.add(2);	

		printList(firstOperand);
		printList(secondOperand);

		LinkedList<Integer> reverseAddition = reverseAddLists(firstOperand, secondOperand, 0);
		printList(reverseAddition);

	}

	public static void printList(LinkedList<Integer> linkedList) {
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
		System.out.print("\n");
	}

	/**
	 * Note that recursivly order when the lists have the one's digit at the head of 
	 * the linked lists allows up to handle lists of different sizes.
	 */
	public static LinkedList<Integer> reverseAddLists(LinkedList<Integer> l1, LinkedList<Integer> l2,
		int carry) {
		
		/* Recursive Base Case */
		if (l1.size() == 0 && l2.size() == 0 && carry == 0) return null;

		/* Operation to be performed during each recursive case */
		int value = carry;
		if (l1.size() > 0) value += l1.removeFirst();
		if (l2.size() > 0) value += l2.removeFirst();

		result.add(value % 10);

		/* Recursive Step */
		if (l1 != null || l2 != null) {			
			LinkedList<Integer> more = reverseAddLists	(l1, l2, value >= 10 ? 1 : 0);
		}

		/* Recursive Return*/
		return result;
	}
}