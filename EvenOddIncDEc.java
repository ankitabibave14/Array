package ArrayPractice;

//import java.util.Scanner;

public class EvenOddIncDEc {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 3rd June 2021");
		System.out.println(" ");

		 int array[] = { 18, 7, 37, 23, 1 };

		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("Enter values: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}*/

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)

				array[i]++;
			else
				array[i]--;

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
