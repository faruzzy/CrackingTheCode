public class InterviewQuestion {
	
	public static void main(String[] args) {
		SetOfStacks setOfStacks = new SetOfStacks();
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		System.out.println("Pop: " + setOfStacks.popAt(0));
		System.out.println("Pop: " + setOfStacks.pop());
		setOfStacks.push(5);
		setOfStacks.push(6);
		
		
		System.out.println("Pop: " + setOfStacks.pop());
		System.out.println("Pop: " + setOfStacks.pop());
		System.out.println("Pop: " + setOfStacks.pop());
		System.out.println("Pop: " + setOfStacks.pop());
	}
}