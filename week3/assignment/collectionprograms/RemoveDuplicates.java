package week3.day2.assignment.collectionprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String input = "PayPal India";
		String lcinput = (input.replaceAll(" ", "")).toLowerCase();
		char[] charArray = lcinput.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}

		System.out.println(charSet);

	}

}
