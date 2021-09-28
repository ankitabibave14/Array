package ArrayPractice;

public class MinMaxDiff {

	public static void main(String[] args) {
		System.out.println(" Name: Ankita Bibave");
		System.out.println("Date: 11 / 06 / 2021\n");

		int array[] = { 4, 5, 6, 7, 8, 9, 12 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Minimun no is: " + min);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Maximum no is: " + max);
		int diff = max - min;
		System.out.println("Difference is : " + diff);
	}

}
