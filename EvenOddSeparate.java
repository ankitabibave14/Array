package ArrayPractice;
public class EvenOddSeparate {
	public static void main(String[] args) {

		int array[] = { 8, 6, 4, 3, 2, 18, 1 };
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (value % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		int evenArray[] = new int[evenCount];
		int oddArray[] = new int[oddCount];
		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (value % 2 == 0) {
				evenArray[evenIndex] = value;
				evenIndex++;
			} else {
				oddArray[oddIndex] = value;
				oddIndex++;
			}
		}
		System.out.println("Even values: ");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.println(evenArray[i] + " ");
		}
		System.out.println();
		System.out.println("Odd values: ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.println(oddArray[i] + " ");
		}
	}
}
