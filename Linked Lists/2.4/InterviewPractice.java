/**
 * Write code to partition a list around x, such that
 * all nodes less than x come before all nodes greater than or equal to x.
 * 
 * Note: Since I wrote my own linked list implementation this will not compile for the
 * time being.
 */
public class InterviewPractice {
	
	public static void main(String[] args) {
		Node list = new Node(10);
		list.appendToTail(3);
		list.appendToTail(5);
		list.appendToTail(6);
		list.appendToTail(2);
		list.appendToTail(1);
		printList(list);
		partitionList(list, 5);
	}

	public static void partitionList(Node list, int pivot) {
		
		Node partitionedList = new Node(list);

		while (list.next !=null) {
			if (list.data < pivot) {
				partitionedList.appendToTail(list.data);
				list.data = list.next.data;
				list.next = list.next.next;
			} else {
				list = list.next;
			}
		}

		partitionedList.appendToTail(list.head);

		printList(partitionedList);
	}

	public static void printList(Node list) {
		while (list != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}
		System.out.print("\n");
	}
}