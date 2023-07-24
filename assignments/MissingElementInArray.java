package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr); // 1,2,3,4,6,7,8

		for (int i = arr[0]; i < arr.length; i++) {
			int j = arr[i - 1];
			if (i != j) {
				System.out.println("Missing number in the array is " + i);
				break;
			}
		}

	}

}
