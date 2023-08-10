package week3.day2.assignment.collectionprograms;

import java.util.Arrays;

public class SortUsingCollections {

	public static void main(String[] args) {

		String[] arr = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		System.out.println("Length of the array: " + arr.length);
		Arrays.sort(arr);
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}

}
