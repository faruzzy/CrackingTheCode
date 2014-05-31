import java.util.ArrayList;
public class PracticeProblem {


    public static void main(String[] args) {
        int[] unsorted = {-1, 0, 2, -3, 5};
        System.out.println("The kth largest is: " + kthLargest(unsorted, 2));
        System.out.println("The kth largest is: " + kthLargest(unsorted, 1));
    }

    public static int kthLargest(int[] array, int k) {

        // Error Checking: k > 0, array is not null

        // Error Checking: k is less than the array size

        ArrayList<Integer> buffer = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {

            if (buffer.size() == 0) {
                buffer.add(array[i]);
                continue;
            }

            int insertIndex = 0;
            while (insertIndex < buffer.size() && array[i] > buffer.get(insertIndex)) {
                insertIndex++;
            }

            buffer.add(insertIndex, array[i]);
            if (buffer.size() > k) buffer.remove(0);
        }

        return buffer.get(0);

    }

}
