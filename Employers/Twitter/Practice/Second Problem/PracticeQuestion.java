public class PracticeQuestion {

    /*
     * Given an array with numbers, your task is to find 4 numbers that will satisfy this equation
     * A + B + C = D
     */
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};

        // Sort the array
        java.util.Arrays.sort(array);
        findSum(array, 0, 1, 2, 6);
    }

    public static void findSum(int[] array, int firstIndex, int secondIndex, int thirdIndex, int target) {
        // Avoid out of bounds exception
        if (thirdIndex > target) {
            return;
        }

        findSum(array, 0, 1, 2, --target);

        // -> If too large can't sum to last element
        if (array[firstIndex] + array[secondIndex] + array[thirdIndex] > array[target]) {
            return;
        }

        // -> If too small move pointers all forward
        if (array[firstIndex] + array[secondIndex] + array[thirdIndex] < array[target]) {
            findSum(array, ++firstIndex, ++secondIndex, ++thirdIndex, target);
        }

        if (array[firstIndex] + array[secondIndex] + array[thirdIndex] == array[target]) {
            System.out.println(array[firstIndex] + " + " + array[secondIndex] + " + " + array[thirdIndex] + " = " + array[target]);
        }

    }
}
