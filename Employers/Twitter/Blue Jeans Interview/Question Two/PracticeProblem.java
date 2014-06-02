import java.lang.Math;

// Given two sorted arrays find the kth minimum
public class PracticeProblem {

    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 9, 13, 15, 17};
        int[] secondArray = {5, 6, 7, 8, 9, 10};

        System.out.println("The kth smallest element is: " + kthMinimum(firstArray, secondArray, 2));
        System.out.println("The kth smallest element is: " + kthMinimum(firstArray, secondArray, 3));
        System.out.println("The kth smallest element is: " + kthMinimum(firstArray, secondArray, 4));
        System.out.println("The kth smallest element is: " + kthMinimum(firstArray, secondArray, 5));
        System.out.println("The kth smallest element is: " + kthMinimum(firstArray, secondArray, 6));

    }

    public static int kthMinimum(int[] arrayOne, int[] arrayTwo, int k) {
        // Error checking, array out of bounds,
        // Error checking, k size in relation to length of k

        int counter = 1;
        int arrayOneIndex = 0;
        int arrayTwoIndex = 0;

        while (counter < k) {
            if (arrayOne[arrayOneIndex] > arrayTwo[arrayTwoIndex]) {
                arrayTwoIndex++;
            } else if (arrayOne[arrayOneIndex] < arrayTwo[arrayTwoIndex]) {
                arrayOneIndex++;
            } else {
                arrayOneIndex++;
                arrayTwoIndex++;
            }
            counter++;
        }
        return Math.min(arrayOne[arrayOneIndex], arrayTwo[arrayTwoIndex]);
    }

}
