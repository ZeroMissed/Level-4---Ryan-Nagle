import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void sort(String[] testArray) {
		// TODO Auto-generated method stub
		List<String> sort = Arrays.asList(testArray);
		Collections.sort(sort);
		testArray = (String[]) sort.toArray();
	}

}
