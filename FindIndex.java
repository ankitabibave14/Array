package ArrayPractice;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		System.out.println(" Name- Ankita Bibave");
		System.out.println("Date - 11 / 06 / 2021");
		System.out.println(" ");

		int[] array = { 18, 37, 7, 45, 99, 101 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find index: ");
		int num = sc.nextInt();

		for (int i = 0; i < array.length; i++) {

			if (num == array[i]) {
				System.out.println("Index is: " + i);

			}
		}
	}
}