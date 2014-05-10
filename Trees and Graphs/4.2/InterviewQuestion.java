/**
 * Given a directed graph, design an algorithm to determine if there
 * is a path between two nodes.
 * 
 * Note: This solutions will not compile
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		Node node = new Node(10);
		Node node2 = new Node(5);
		Node node3 = new Node(20);
		Node node4 = new Node(4);
		Node node5 = new Node(6);
		Node node6 = new Node(100);

		node.left = node2;
		node.right = node3;
		node.left.left = node4;
		node.left.right = node5;

		if (isPathDepthFirstSearch(node,node2) != null) {
			System.out.println("There is a path between the two nodes");
		} else {
			System.out.println("There is not a path between the two nodes");
		}

		if (isPathBreadthFirstSearch(node,node6) != null) {
			System.out.println("There is a path between the two nodes");
		} else {
			System.out.println("There is not a path between the two nodes");
		}

	}

	/**
	 * Depth first search is the same as pre-order traversal
	 */
	public static boolean isPathDepthFirstSearch(Node node1, Node node2) {
		// If we've hit a loop we've been through them all didn't find it
		if (node1 == null || node1.visited) return false;
		
		// We found the node
		if (node1 == node 2) return true;
		
		// Search the nodes children
		foreach (Node n : node1.adjacent) {
			if (n.visited) continue;
			isPathDepthFirstSearch(n, node2);
		}
	}

	public static boolean isPathBreadthFirstSearch(Node node1, Node node2) {
		// Operates as a queue
		LinkedList<Node> q = new LinkedList<Node>;

		q.enqueue(node1);

		while (!q.isEmpty()) {
			Node node = q.dequeue();
			node.visited = true;
			// We require a list of adjacent nodes
			for (Node n : node.adjacent()) {
				if (n.visited) continue;
				n.visited = true;
				if (n.data == node2.data) return true;
				enqueue(n);
			}
		}
	
		return false;
	}

}