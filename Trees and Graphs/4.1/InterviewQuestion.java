import java.lang.Math;

/**
 * Implement a function to check if a binary tree is balanced.
 * A balanced tree is defined to be a tree such that the heights
 * of the two subtrees of any node never differ by more than one.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		// Tree that is balanced - height difference of one
		Node node = new Node(10);
		node.left = new Node(5);
		node.right = new Node(20);
		node.left.left = new Node(4);
		node.left.right = new Node(6);

		if (isBalanced(node)) {
			System.out.println("The first tree is balanced.");
		} else {
			System.out.println("The first tree is not balanced.");
		}

		// Tree that is not balanced - height difference of two
		Node node2 = new Node(10);
		node2.left = new Node(9);
		node2.left.left = new Node(8);

		if (isBalanced(node2)) {
			System.out.println("The second tree is balanced.");
		} else {
			System.out.println("The second tree is not balanced.");
		}
	}

	public static int checkHeight(Node root) {
		if (root == null) return 0;

		/* Check if left node is balanced */
		int leftHeight = checkHeight(root.left);
		if (leftHeight == -1) return -1; // Not balanced

		/* Check if right node is balanced */
		int rightHeight = checkHeight(root.right);
		if (rightHeight == -1) return -1; // Not balanced

		/* Check if current node is balanced */
		int heightDiff = rightHeight - leftHeight;
		
		// Trees are not balanced
		if (Math.abs(heightDiff) > 1) return -1;

		// Return height
		return Math.max(rightHeight, leftHeight) + 1;
	}

	public static boolean isBalanced(Node root) {
		if (checkHeight(root) == -1) {
			return false;
		} else {
			return true;
		}
	}

}
