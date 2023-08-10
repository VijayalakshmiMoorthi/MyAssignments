package week3.day2.assignment.collectionprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 6, 6, 7, 5, 9, 2, 10 };
		Set<Integer> numberSet = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			numberSet.add(arr[i]);
		}
		System.out.println(numberSet);

		List<Integer> numlist = new ArrayList<Integer>(numberSet);
		for (int j = 0; j < numlist.size(); j++) {
			if (numlist.get(j) != (j + 1) && !numlist.contains(j + 1)) {
				System.out.println("Missing number is: " + (j + 1));
			}

		}
	}

}
