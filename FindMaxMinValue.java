package ArrayPractice;

public class FindMaxMinValue {

	public static void main(String[] args) {


		int array[] = { 18, 0, 37, 45, 101, 100000 };
		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Smallest no is: " + min);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Largest no is: " + max);
	}
}
