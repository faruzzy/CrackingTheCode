public class InterviewQuestion {
	
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		System.out.println("Dequeue: " + myQueue.dequeue());
		System.out.println("Dequeue: " + myQueue.dequeue());
		System.out.println("Dequeue: " + myQueue.dequeue());
	}
}