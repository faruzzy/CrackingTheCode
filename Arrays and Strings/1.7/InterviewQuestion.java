/**
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to zero.
 */
public class InterviewQuestion {

	public static void main(String[] args) {
		int[][] matrix = {{1,1,0,1,1},
						  {2,2,2,2,2},
						  {0,3,3,3,3},
						  {4,4,4,4,4},
						  {5,5,5,5,5}};

		int[][] zeroedMatrix = {{1,1,0,1,1},
						 		{2,2,2,2,2},
						  		{0,3,3,3,3},
						  		{4,4,4,4,4},
						  		{5,5,5,5,5}};

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) {
					zeroRowColumn(zeroedMatrix, i, j);
				}
			}
		}		

		// Print the matrixes
		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix.length; l++) {
				System.out.print(matrix[k][l]);
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		for (int a = 0; a < zeroedMatrix.length; a++) {
			for (int b = 0; b < zeroedMatrix.length; b++) {
				System.out.print(zeroedMatrix[a][b]);
			}
			System.out.print("\n");
		}

		/**
		 * Note that we could also modify the original matrix and treat our
		 * secondary matrix as a zero store. This would use the same amount of space
		 * but would be arguably better since the two matrixes woudn't have to have
		 * the same values to begin with.
		 */
	}

	public static void zeroRowColumn(int[][] zeroedMatrix, int row, int column) {
		for (int i = 0; i < zeroedMatrix.length; i++) {
			for (int j = 0; j < zeroedMatrix.length; j++) {
				if (i == row || j == column) {
					zeroedMatrix[i][j] = 0;
				}
			}
		}
	}

}