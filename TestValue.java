package ArrayPractice;

public class TestValue {

	public static void main(String[] args) {
		System.out.println(" Name- Ankita Bibave");
	

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int num = 90;
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				System.out.println("Index is: " + i);
				counter++;
			}
		}
		if (counter == 0)
			System.out.println("Not found");
	}
}
