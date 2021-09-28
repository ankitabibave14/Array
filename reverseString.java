package ArrayPractice;

//import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
	
		int array1[] = {  123, 542,23,45,65,73,2, 1 };

		int lastId = array1.length - 1;
		for (int i = 0; i < array1.length / 2; i++) {
			int temp = array1[i];
			array1[i] = array1[lastId];
			array1[lastId] = temp;
			lastId--;
		}
		System.out.println("Reverse Array will be: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}
