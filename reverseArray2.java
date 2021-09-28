package ArrayPractice;
public class reverseArray2 {
	public static void main(String[] args) {
		System.out.println("Name - Ankita Bibave");
		System.out.println("Date - 11 / 06 /  2021");
		System.out.println(" ");

		int array1[] = { 18, 19, 20, 21, 73,65, 90,83,12 };

		int last = array1.length - 1;

		for (int i = 0; i < array1.length / 2; i++) {
			array1[i] = array1[i] * array1[last];
			array1[last] = array1[i] / array1[last];
			array1[i] = array1[i] / array1[last];
			last--;
		}
		System.out.println("Reverse array: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}
