public class Stack {
	Node top;
	Stack minimumStack;

	public Stack() {

	}

	public Stack(Stack stack) {
		minimumStack = stack;
	}

	public void push(int d) {
		if (top != null) {
			Node toBePushed = new Node(d);
			if (d <= top.data && minimumStack != null) minimumStack.push(toBePushed.data);
			toBePushed.next = top;
			top = toBePushed;	
		} else {
			top = new Node(d);
			if (minimumStack != null) minimumStack.push(top.data);
		}
	}

	public Node pop() {
		if (top == null) return null;
		Node topStack = top;
		if (minimumStack != null && topStack.data == minimumStack.top.data) minimumStack.pop();
		top = top.next;
		return topStack;
	}

	public int minimum() {
		return minimumStack.top.data;
	}

	public Node peek() {
		return top;
	}
}