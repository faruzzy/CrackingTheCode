/**
 * Implement a function to check if a tree is a binary search tree.
 */
public class InterviewQuestion {

	public static void main(String[] args) {
		isBinarySearchTree(node, Integer.min, Integer.max);
	}

	public static boolean isBinarySearchTree(Node node, int min, int max) {
		if (node.left != null) {
			if (node < node.left || isBinarySearchTree(node.left, min, node.value)) {
				return false;
			}
		}

		if (node.right != null) {
			if (node > node.right || isBinarySearchTree(node.right, node.value, max)) {
				return false;
			}
		}

		return true;
	}
}