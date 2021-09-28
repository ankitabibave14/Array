package ArrayPractice;

public class AntiDigonal {

	public static void main(String[] args) {
		System.out.println("Name : Ankita Bibave \n Date: 10th June 2021 \n\n");

		int[][] array1 = { { 1, 0, 0}, { 0, 5, 0 }, { 0, 8, 0 } };
		int counter = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (j - i != 0 && j + i != 2)
					counter++;
			}
		}
		int array2[] = new int[counter];
		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (j - i != 0 && j + i != 2)
					array2[index++] = array1[i][j];
			}
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
