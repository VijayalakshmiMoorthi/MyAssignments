package week3.day2.assignment.collectionprograms;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "Vijayalakshmi";
		char[] charArray = name.toCharArray();
		Set<Character> uniqSet = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			uniqSet.add(charArray[i]);
		}

		System.out.println(uniqSet);
	}

}
