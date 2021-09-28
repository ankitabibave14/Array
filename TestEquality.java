package ArrayPractice;
public class TestEquality {
	public static void main(String[] args) {
		System.out.println("Name - Ankita Bibave");
		System.out.println("Date - 11 / 06 / 2021");
		System.out.println(" ");
		int array1[] = { 2, 3, 4, 5, 6, 7 };
		int array2[] = { 2, 3, 4, 5, 6, 7 };
		boolean areSame = true;
		if (array1.length == array2.length) {
			for (int i = 0; i < array2.length; i++) {
				if (array1[i] != array2[i])
					areSame = false;
			}
		} else
			areSame = false;

		if (areSame == true)
			System.out.println("Both Arrays are same..");
		else
			System.out.println("Both arrays are different..");

	}

}
