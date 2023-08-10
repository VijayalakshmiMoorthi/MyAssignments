package week3.day2.assignment.collectionprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> input = new TreeSet<Integer>();
		for (Integer i : data) {
			input.add(i);
		}
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(input);
		int size = list.size();
		Integer secondLargest = list.get(size - 2);
		System.out.println("Second Largest number is " + secondLargest);
	}

}
