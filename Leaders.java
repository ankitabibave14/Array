package ArrayPractice;

//import java.util.Scanner;
public class Leaders {
	public static void main(String[] args) {
		// index 0 1 2 3 4 5 6 7 8 9
		int array[] = { 18, 7, 37, 23, 1, 6, 6, 4, 3, 1 };
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter size of array: "); int size = sc.nextInt(); int
		 * array[] = new int[size];
		 * 
		 * System.out.println("Enter values: "); for (int i = 0; i < size; i++) {
		 * array[i] = sc.nextInt(); }
		 */
		System.out.println("Leader numbers are: ");
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			boolean isLeader = true;
			for (int j = i + 1; j < array.length; j++) {
				int rightSide = array[j];
				if (rightSide >= num)
					isLeader = false;
			}
			if (isLeader == true)
				System.out.print(num + " ");
		}

	}
}
