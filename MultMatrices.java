package ArrayPractice;

public class MultMatrices {

	public static void main(String[] args) {
	

		int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		int matrix2[][] = { { 9, 8, 7 }, { 6, 5, 4 } };

		int matrix3[][] = new int[matrix1.length][matrix2.length];

		for (int i = 0; i < matrix1[i].length; i++) {
			for (int j = 0; j < matrix2[j].length; j++) {
				for (int k = 0; k < matrix1[j].length; k++) {

					matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
				}
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}
}

