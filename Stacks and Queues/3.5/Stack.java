public class Stack {
	
	private Node top;

	public Stack() {

	}

	public void push(Integer d) {
		if (top == null) {
			top = new Node(d);
			return;
		}

		Node pushToTop = new Node(d);
		pushToTop.next = top;
		top = pushToTop;
	}

	public Integer pop() {
		if (top == null) return null;

		int popped = top.data;
		top = top.next;
		return popped;
	}
}