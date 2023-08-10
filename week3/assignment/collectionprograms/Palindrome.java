package week3.day2.assignment.collectionprograms;

public class Palindrome {

	public static void main(String[] args) {

		String actualString = "madam";
		String reverseString = "";
		int length = actualString.length();
		for (int j = length - 1; j >= 0; j--) {
			reverseString = reverseString + actualString.charAt(j);
		}

		System.out.println(reverseString);

		if (actualString.equalsIgnoreCase(reverseString)) {
			System.out.println("Given word is a palindrome");
		} else {
			System.out.println("Given word is not a palindrome");
		}

	}

}
