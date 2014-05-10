import java.util.LinkedList;

public class Node {
	Node left;
	Node right;
	int data;
	LinkedList<Node> adjacentNodes = new LinkedList<Node>();


	public Node(int d) {
		data = d;
	}

	public void addNode(Node n) {
		adjacentNodes.add(n);
	}

	public LinkedList<Node> adjacentNodes() { 
		return adjacentNodes;
	}
}