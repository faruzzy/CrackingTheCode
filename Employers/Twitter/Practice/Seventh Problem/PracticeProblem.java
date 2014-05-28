public class PracticeProblem {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("The item was found in this position of the array: "
                            + binarySearch(array, 9));
    }

    public static int binarySearch(int[] array, int value) {
        System.out.println("The size is: " + array.length);
        int size = array.length;
        int testIndex = size/2;
        System.out.println("The value is: " + array[testIndex]);


        if (array[testIndex] < value) {
            return binarySearch(java.util.Arrays.copyOfRange(array, testIndex + 1, size), value);
        }

        if (array[testIndex] > value) {
            return binarySearch(java.util.Arrays.copyOfRange(array, 0, testIndex), value);
        }

        return testIndex;
    }
}
