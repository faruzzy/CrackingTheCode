import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Given a binary tree design an algorithm which creates a linked list of all the
 * nodes at each depth. If you have tree with depth d you should have d linked lists.
 * 
 * Note: This solution will not compile.
 */
public class InterviewQuestion {
	
	/**
	 * Implemented with depth first search
	 */
	void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists,
		int level) {

		if (root == null) return; // base case

		LinkedList<TreeNode> list = null;

		if (lists.size() == level) { // Level not contained in list
			list = new LinkedList<TreeNode>();
			/**
			 * Levels are always traversed in order so if this is the first time
			 * we've visited level i, we must have see levels 0 through i - 1. We
			 * can therefore safely add the level at the end. 
			 */
			lists.add(list);
		} else {
			list = lists.get(level);
		}

		list.add(root);
		createLevelLinkedList(root.left, lists, level+1);
		createLevelLinkedList(root.right, lists, level+1);
	}

	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(
		TreeNode root) {
		
		ArrayList<LinkedList<TreeNode>> lists =
			new ArrayList<LinkedList<TreeNode>>();
		
		createLevelLinkedList(root, lists, 0);
		
		return lists;
	}

	/**
	 * Implemented with breadth first search
	 */
	void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists) {
		if (root == null) return;

		// LinkedList to act as a queue
		LinkedList<Node> q = new LinkedList<Node>();

		
		LinkedList<TreeNode> levelZero = new LinkedList<TreeNode>();
		levelZero.add(root)
		lists.add(levelZero);

		q.add(root);	
		while (!q.isEmpty()) {
			Node processing = q.dequeue();
			LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
			for(Node processing : process.adjacent()) {
				nextLevel.add(processing);
				q.enqueue(processing);
			}
		}
	}

	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(
		TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();

		createLevelLinkedList(root, lists);

		return lists;
	}
}