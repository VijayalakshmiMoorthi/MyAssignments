package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		int length = num.length;
		System.out.println("Duplicates in array are :");
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}

	}
}
