package ArrayPractice;

import java.util.Scanner;

public class SumAvg2 {

	public static void main(String[] args) {
		System.out.println(" Name- Ankita Bibave");
		System.out.println("Date - 31/ 05/ 2021");
		System.out.println(" ");

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter numbers: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Sum is: " + sum);
		int Avg = sum / arr.length;
		System.out.println("Avg is: " + Avg);
	}
}
