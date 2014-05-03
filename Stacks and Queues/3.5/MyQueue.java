public class MyQueue {
	
	private Stack queuingStack;
	private Stack dequeuingStack;

	public MyQueue() {
		queuingStack = new Stack();
		dequeuingStack = new Stack();
	}

	public void enqueue(int d) {
		queuingStack.push(d);
	}

	public Integer dequeue() {
		
		swapStacks(queuingStack, dequeuingStack, true);

		Integer firstIn = dequeuingStack.pop();

		swapStacks(dequeuingStack, queuingStack, false);

		return firstIn;
	}

	public void swapStacks(Stack firstStack, Stack secondStack, boolean Q2DQ) {
		Integer poppedValue = firstStack.pop();
		while (poppedValue != null) {
			secondStack.push(poppedValue);
			poppedValue = firstStack.pop();
		}

		if (Q2DQ) {
			dequeuingStack = secondStack; 
			queuingStack = firstStack;
		} else {
			dequeuingStack = firstStack;
			queuingStack = secondStack;
		}
	}
}