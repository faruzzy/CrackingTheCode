/**
 * Implement an algorithm to delete a node in the middle of a 
 * singly linked list given access only to that node.
 * 
 * Note: This code won't run.
 */
public class InterviewPractice {
	
	/**
	 * Copy the data from the next node to the current node.
	 * Remove the next node by adjusting the current node's pointer.
	 */
	
	node.data = node.next.data;
	node.next = node.next.next;
}