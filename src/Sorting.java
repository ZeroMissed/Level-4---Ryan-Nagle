
public class Sorting {

	public static void sort(String[] testArray) {
		String compared;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < testArray.length - 1; i++) {
				compared = testArray[i];
				if (testArray[i + 1].compareTo(compared) < 0) {
					testArray[i] = testArray[i + 1];
					testArray[i + 1] = compared;
					swapped = true;
				}
			}
		}
	}
}
