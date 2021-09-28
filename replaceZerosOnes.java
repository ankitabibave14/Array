package ArrayPractice;

public class replaceZerosOnes {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 11 / 06 / 2021");
		System.out.println(" ");
		int array[] = { 1, 0, 1, 5, 0, 7, 0, 2, 0, 4, 0, 9 };

		// Way 1 :
		/*
		 * for (int i = 0; i < array.length; i++) {
		 * 
		 * if (array[i] == 0) System.out.print(1 + " "); else System.out.print(array[i]
		 * + " ");
		 * 
		 * } }
		 */

		// Way 2:

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				array[i] = 1;
		}

		System.out.println("After replecement: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
