package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(data);
		int length = data.length;
		System.out.println("Second Largest number is " + data[length - 2]);
	}

}
