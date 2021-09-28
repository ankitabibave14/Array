package ArrayPractice;

public class AddMatrices {

	public static void main(String[] args) {

		int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int matrix2[][] = { { 4, 9, 5 }, { 2}, { 3, 6, 1 } };

		int matrix3[][] = new int[matrix1.length][matrix1.length];

		if (matrix1.length == matrix2.length) {
			for (int i = 0; i < matrix3.length; i++) {
				for (int j = 0; j < matrix3[i].length; j++) {
					matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
			for (int i = 0; i < matrix3.length; i++) {
				for (int j = 0; j < matrix3[i].length; j++) {
					System.out.print(" " + matrix3[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("Wrong Input,..");
		}
	}
}
