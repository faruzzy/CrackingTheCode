import java.util.LinkedList;

public class InterviewQuestion {
	
	private static LinkedList<String> pound = new LinkedList<String>();

	private static final String Cat = "Cat";
	private static final String Dog = "Dog";

	public static void main(String[] args) {
		enqueue(Dog);
		enqueue(Cat);
		enqueue(Dog);
		enqueue(Dog);
		enqueue(Cat);
		enqueue(Dog);
		enqueue(Cat);

		printList();

		dequeueDog();
		printList();		
	}

	public static void enqueue(String animal) {
		pound.add(animal);
	}

	public static void dequeueCat() {
		for (int i = 0; i < pound.size(); i++) {
			if (pound.get(i) == Cat) {
				pound.remove(i);
				break;
			}
		}
	}

	public static void dequeueDog() {
		for (int i = 0; i < pound.size(); i++) {
			if (pound.get(i) == Dog) {
				pound.remove(i);
				break;
			}
		}
	}

	public static void printList() {
		for (String s : pound) System.out.println(s);
		System.out.println("");
	}

	public static void dequeueAny() {
		pound.remove();
	}

}