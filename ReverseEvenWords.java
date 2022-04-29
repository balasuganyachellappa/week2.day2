package week2.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] array = test.split(" ");

		for (int i = 0; i < array.length; i++) {
			String rev = " ";

			if (i % 2 != 0) {
				char[] array1 = test.toCharArray();
				System.out.println(array[i] + "");
				for (int j = array.length - 1; j >= 0; j--) {

					rev = rev + array[j];

				}

				System.out.println(rev + " ");
			} else {
				System.out.println(test);
				System.out.println(array[i] + " ");
			}
		}

	}
}
