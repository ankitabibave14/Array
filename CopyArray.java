package ArrayPractice;

public class CopyArray {

	public static void main(String[] args) {


		int arr1[] = {1,2,3,4,5,6,7,8,9,0 };
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {

			System.out.print(arr1[i] + " "); // Array 1
		}
		System.out.println();
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j] + " "); // Array 2
		}
		System.out.println();
		for (int k = 0; k < arr1.length; k++) {
			arr2[k] = arr1[k]; // array copied
			System.out.print(arr2[k] + " ");
		}
	}
}