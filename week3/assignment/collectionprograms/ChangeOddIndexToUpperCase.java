package week3.day2.assignment.collectionprograms;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] charArray = test.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length; i++) {
			if ((i % 2 )!= 0) {
				char a = charArray[i];
				char upperCase = Character.toUpperCase(a);
				System.out.print(upperCase);
			} else {
				System.out.print(charArray[i]);
			}
		}

	}

}
