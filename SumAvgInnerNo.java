package ArrayPractice;

public class SumAvgInnerNo {

	public static void main(String[] args) {

		int matrix1[][] = { { 1, 2, 3, 6 }, { 9, 0, 6, 8 }, { 7, 8, 9, 6 }, { 5, 4, 3, 2 } };

		int sum = 0;
		int counter = 0;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				if (i != 0 && j != 0 && i != matrix1.length - 1 && j != matrix1[i].length - 1) {
					sum = sum + matrix1[i][j];
					counter++;
				}
			}
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Avg is: " + (sum / counter));
	}
}
