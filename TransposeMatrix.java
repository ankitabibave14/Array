package ArrayPractice;

public class TransposeMatrix {

	public static void main(String[] args) {
		System.out.println("Name : Ankita Bibave \n Date: 11/06/2021 \n\n");

		int[][] array1 = { { 1, 0, 3 }, { 4, 0, 6 }, { 7, 0, 9 } };
		int[][] array2 = new int[3][3];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[j][i] = array1[i][j];
			}
		}
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
	}
}

