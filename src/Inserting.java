import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Inserting {

	public static int[] insertAt(int[] inputArray, int index, int value) {
		// TODO Auto-generated method stub
		int[] finalArray = new int[inputArray.length + 1];
		
		for(int i = 0; i < finalArray.length; i++) {
			if(i < index) {
				finalArray[i] = inputArray[i];
			} else if(i > index) {
				finalArray[i] = inputArray[i-1];
			} else {
				finalArray[i] = value;
			}
		}
		return finalArray;
	}

	public static String[] insertAlphabetically(String[] input, String string) {
		ArrayList<String> list = new ArrayList<String>();
		for(String i: input) {
			list.add(i);
		}
		list.add(string);
		Collections.sort(list);
		System.out.println(list);
		return (String[]) list.toArray(new String[11]);
		
	}

}

