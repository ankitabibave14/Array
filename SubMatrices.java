package ArrayPractice;

public class SubMatrices {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave \n Date: 11/06/2021 \n\n");

		int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int matrix2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 7,3,5 } };

		int matrix3[][] = new int[matrix1.length][matrix2.length];

		if (matrix1.length == matrix2.length) {

			for (int i = 0; i < matrix3.length; i++) {
				for (int j = 0; j < matrix3[i].length; j++) {
					matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
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

