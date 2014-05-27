public class PracticeQuestion {

    // Write a function to find all combinations of three numbers that sum to zero
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, -2, -1, 0, 2, -3, 0};

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                for (int k = j + 1; k < 9; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) System.out.println(numbers[i] + ", " + numbers[j] + ", " + numbers[k]);
                }
            }
        }

    }

}
