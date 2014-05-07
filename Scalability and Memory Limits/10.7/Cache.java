public class Cache {
	public static int MAX_SIZE = 10;
	public Node head, tail;
	public HashMap<String, Node> map;
	public int size = 0;

	public Cache() {
		map = new HashMap<String,Node>();
	}

	/** Moves node to front of linked list */
	public void moveToFront(Node node) {

	}

	/** Performs a lookup on a node then moves it to the front of linked list*/
	public void moveToFront(String query) {

	}

	/** Removes node from linked list*/
	public void removeFromLinkedList(Node node) {

	}

	/* Gets results from cache and updates linked list */
	public String[] getResults(String query) {
		// Query was not in cache
		if (!map.containsKey(query)) return null; 

		Node node = map.get(query);
		moveToFront(node); // Update the freshness of the node
		return node.results;
	}

	/**
	 * Updates the contents of the cache.
	 *
	 * It is very intesting to note that once an item is retrieved from
	 * a HashMap and is updated it does not have to be put back into the map.
	 */
	public void insertResults(String query, String[] results) {
		// Query was in cache
		if (map.containsKey(query)) {
			// Update the node in LinkedList
			Node node = map.get(query);
			node.results = results;
			moveToFront(node); 
			return;
		}

		// Query was not in cache
		Node node = new Node(query, results);
		moveToFront(node);
		map.put(query, node);

		// Note that there are two places to update, the hash map and the linked list
		if (size > MAX_SIZE) {
			map.remove(tail.query);
			removeFromLinkedList(tail);
		}
	}

}