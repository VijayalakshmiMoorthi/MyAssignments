package week3.day2.assignment.collectionprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");

		Set<String> modifiedText = new LinkedHashSet<String>();

		for (int i = 0; i < split.length; i++) {
			modifiedText.add(split[i]);
		}

		System.out.print(modifiedText);

	}

}
