/**
 * Given an image represented by an NxN matrix, where each
 * pixel is 4 bytes, rotate the image by 90 degrees.
 * Can you do this in place?
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		int[][] rotateMe = {{1,1,1,1},
		{2,2,2,2},
		{3,3,3,3},
		{4,4,4,4}};

		for (int i = 0; i < rotateMe.length; i++) {
			for (int j = 0; j < rotateMe.length; j++) {
				System.out.print(rotateMe[i][j]);
			}
			System.out.print("\n");
		}
		
		int[][] rotated = rotate(rotateMe);

		System.out.print("\n");
		for (int i = 0; i < rotated.length; i++) {
			for (int j = 0; j < rotated.length; j++) {
				System.out.print(rotated[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static int[][] rotate(int[][] matrix) {

		/**
		 * Work our way from the top to the midpoint of the matrix.
		 * Once we've made it halfway through the number of rows we're done since we've
		 * swapped each of the top elements with one from the bottom.
		 */
		for (int layer = 0; layer < matrix.length / 2; layer++) {
			// Location to swap
			int first = layer;
			
			// Location to be swapped with
			int last = matrix.length - 1 - layer;

			// Work our way accross the columns of the matrix
			for (int i = first; i < last; i++) {

				// Used to get the specific row or column we want
				int offset = i - first;

				// Store the top
				int top = matrix[first][i];

        		// left -> top
				matrix[first][i] = matrix[last - offset][first];

        		// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];

        		// right -> bottom
				matrix[last][last-offset] = matrix[i][last];

        		// top -> right
				matrix[i][last] = top;
			}
		}

		return matrix;
	}

}