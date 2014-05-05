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

		if (isPath(node,node2) != null) {
			System.out.println("There is a path between the two nodes");
		} else {
			System.out.println("There is not a path between the two nodes");
		}

		if (isPath(node,node6) != null) {
			System.out.println("There is a path between the two nodes");
		} else {
			System.out.println("There is not a path between the two nodes");
		}

	}

	public static boolean isPathDepthFirstSearch(Node node1, Node node2) {
		if (node1 == null || node1.visited) return false;

		n.visited = true;

		for(Node n: node1.adjacent) {
			if (n.data != node2.data) return isPath(n, node2);
		}
	}

	public static boolean isPathBreadthFirstSearch(Node node1, Node node2) {
		// Operates as a queue
		LinkedList<Node> q = new LinkedList<Node>;

		q.enqueue(node1);

		while (!q.isEmpty()) {
			Node node = q.dequeue();
			node.visited = true;
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