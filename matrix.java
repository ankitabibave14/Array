package ArrayPractice;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		System.out.println("Name : Ankita Bibave \n Date: 11/06/2021 \n\n");

		int[][] array = new int[4][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
