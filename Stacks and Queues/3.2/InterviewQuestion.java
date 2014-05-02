/**
 * How would you design a stack that in addition to push
 * and pop has a min function that operatin in 0(1) time.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		Stack minimumStack = new Stack();
		Stack stack = new Stack(minimumStack);
		stack.push(10);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(0);
		stack.push(6);

		System.out.println("The minimum is: " + stack.minimum());
		stack.pop();
		System.out.println("The minimum is: " + stack.minimum());
		stack.pop();
		System.out.println("The minimum is: " + stack.minimum());
		stack.pop();
		System.out.println("The minimum is: " + stack.minimum());
	}
}