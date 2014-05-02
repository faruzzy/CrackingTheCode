/**
 * Describe how you could use a single array to implement three stacks.
 */
public class InterviewQuestion {
	
	private static int stackSize = 100;
	private static int[] stack = new int[stackSize*3];
	private static int[] stackPointer = {-1, -1, -1};

	public static void main(String[] args) {
		try {
			pushToStack(0, 1);
			pushToStack(0, 2);
			pushToStack(0, 3);
			pushToStack(0, 4);
			pushToStack(0, 5);
			printStack(0);

			pushToStack(1, 6);		
			pushToStack(1, 7);
			pushToStack(1, 8);
			pushToStack(1, 9);
			pushToStack(1, 10);
			printStack(1);

			pushToStack(2, 11);
			pushToStack(2, 12);
			pushToStack(2, 13);
			pushToStack(2, 14);
			pushToStack(2, 15);
			printStack(2);	
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getStackTrace());
		}
		
	}

	public static void pushToStack(int stackNumber, int value) throws Exception {
		// Error case
		if (stackPointer[stackNumber] == 100) throw new Exception("Stack is full.");

		stackPointer[stackNumber]++;
		stack[getTopOfStack(stackNumber)] = value; 
	}

	public static int popFromStack(int stackNumber) throws Exception {
		// Error case
		if (stackPointer[stackNumber] == 0) throw new Exception("Stack is empty.");

		int popped = stack[getTopOfStack(stackNumber)];
		stack[getTopOfStack(stackNumber)] = 0; // Clear previous value that was top of stack.
		stackPointer[stackNumber]--;

		return popped;
	}

	public static int getTopOfStack(int stackNumber) {
		return stackNumber * stackSize + stackPointer[stackNumber];
	}

	public static void printStack(int stackNumber) {
		for (int i = 0; i <= stackPointer[stackNumber]; i++) {
			System.out.println("Stack value: " + stack[getTopOfStack(stackNumber) - i]);
		}
	}
}