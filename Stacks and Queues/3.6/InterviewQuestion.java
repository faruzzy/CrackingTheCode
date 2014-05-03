import java.util.Stack;

public class InterviewQuestion {

	private	static Stack<Integer> firstStack = new Stack<Integer>();
	
	
	public static void main(String[] args) {
		firstStack.push(4);
		firstStack.push(2);
		firstStack.push(1);
		firstStack.push(3);

		System.out.println(firstStack.toString());
		firstStack = sortStack(firstStack);
		System.out.println(firstStack.toString());
	}

	public static Stack<Integer> sortStack(Stack<Integer> s) {

		Stack<Integer> r = new Stack<Integer>();

		while (!s.isEmpty()) {
			Integer tmp = s.pop();
			while (true) {
				if (r.isEmpty() || tmp > r.peek()) {
					r.push(tmp);
					break;
				} else {
					s.push(r.pop());
				}
			}
		}
		return r;
	}
}