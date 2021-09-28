package ArrayPractice;

public class FindMinMaxInMatrix {

	public static void main(String[] args) {
		System.out.println("Name : Ankita Bibave \n Date: 11/ 06/ 2021 \n\n");

		int[][] array1 = { { 0, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (array1[i][j] > max)
					max = array1[i][j];
			}
		}
		System.out.println("Max no in matrix : " + max);
		
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++)

			{
				if (array1[i][j] < min)
					min = array1[i][j];
			}
		}
		System.out.println("Min no in matrix : " + min);

	}

}
