public class InterviewQuestion {
	public static void main(String[] args) {
		int[] array = {-100,100,200,300};

		System.out.println("Magic index: " + hasMagicIndex(array, 0, array.length - 1));
	}

	public static int hasMagicIndex(int[] array, int startIndex, int endIndex) {
		
		if (endIndex < startIndex || startIndex < 0 || endIndex > array.length) return -100;
		

		int mid = (startIndex + endIndex) / 2;

		if (array[mid] == mid) return mid;

		if (array[mid] > mid) return hasMagicIndex(array, startIndex, mid - 1);

		return hasMagicIndex(array, mid + 1, endIndex);
	}
}