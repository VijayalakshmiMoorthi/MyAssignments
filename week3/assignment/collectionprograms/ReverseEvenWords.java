package week3.day2.assignment.collectionprograms;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

		String[] arr = test.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if ((i % 2) != 0) {
				String evenWord = arr[i];
				char[] charArray = evenWord.toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			} else {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}

	}

}
