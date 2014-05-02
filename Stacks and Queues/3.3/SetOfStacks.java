import java.util.Stack;
import java.util.ArrayList;

/**
 * Implement a datastructure that is composed of several stacks
 * and creates a new stack when the old exceeds capactity.
 */
public class SetOfStacks {
	
	private ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	private int stackIndex;
	private static int maxStackCapacity = 3;
	private static int stackItemCount = 0;

	public SetOfStacks() {
		stackIndex = -1;
		addStack();
	}

	public void addStack() {
		Stack<Integer> stack = new Stack<Integer>();
		stacks.add(stack);
		stackIndex++;
		stackItemCount = 0;
	}

	public void push(int data) {
		if (stackItemCount == maxStackCapacity) {
			System.out.println("Capacity reached adding new stack.");	
			addStack();
		}
		System.out.println("Adding to stack: " + stackIndex);
		stacks.get(stackIndex).push(data);
		stackItemCount++;
	}

	public int pop() {
		if (stackItemCount == 0) {
			stackIndex--;
			stackItemCount = stacks.get(stackIndex).size();
		}
		int value = stacks.get(stackIndex).pop();
		stackItemCount--;
		return value;
	}

	public int popAt(int stackIndex) {
		if (stackIndex == this.stackIndex) stackItemCount--;
		return stacks.get(stackIndex).pop();	
	}
}