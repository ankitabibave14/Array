package ArrayPractice;

public class SecondLargestInMatrix {

	public static void main(String[] args) {
		System.out.println("Name : Ankita Bibave \n Date: 11/06/2021 \n\n");
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 81, 12} };
		int max = Integer.MIN_VALUE;
		int maxSecondLast = Integer.MIN_VALUE;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (array1[i][j] > max)
					max = array1[i][j];
			}
		}
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (array1[i][j] != max && array1[i][j] > maxSecondLast)
					maxSecondLast = array1[i][j];
			}
		}
		System.out.println("Second Largest no: " + (maxSecondLast));
	}

}
