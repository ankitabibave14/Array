package ArrayPractice;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 11 / 06 /2021\n");
		// index 		0	 1	 2	 3	 4	 5	 6	 7	 8	 9
		int array[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		boolean isPresent = false;
		int num = 13;
		int min = 0;
		int max = array.length - 1;

		while (min < max) {
			int mid = (min + max) / 2;
			if (array[mid] == num) {
				System.out.println("Number is present at Index: " + mid);
				isPresent = true;
				break;
			} else if (array[mid] < num) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		if (isPresent == false)
			System.out.println("Number is not present..");
	}
}
