package ArrayPractice;

public class SumAvg1 {

	public static void main(String[] args) {
		System.out.println(" Name- Ankita Bibave");
		System.out.println("Date - 11/ 06 / 2021\n");
		
		int a[] = { 90, 78, 89, 54, 97, 75, 88 }; // array
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Total sum is : " + sum);
		int avg = sum / a.length;
		System.out.println("Average is: " + avg);
	}
}
