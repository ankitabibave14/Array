package ArrayPractice;

public class LeftShift {

	public static void main(String[] args) {
		System.out.println("Name - Ankita Bibave");
		System.out.println("Date - 11 / 06 / 2021");
		System.out.println(" ");

		int array[] = { 0,1,2,3,4,5,6,7,8,9,0 };

		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		System.out.println("Left shift will be: ");
		array[array.length - 1] = temp;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
