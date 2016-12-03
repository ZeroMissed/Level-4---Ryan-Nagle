import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayManipulation {
	@Test
	public void testSortAnArray() throws Exception {
	   
		String[] testArray = { "concerned", "affected", "fascinated",
	           	"intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
	           	"engrossed", "curious" };
	   	new Sorting().sort(testArray);
	   	assertEquals("absorbed", testArray[0]);
	   	assertEquals("affected", testArray[1]);
	   	assertEquals("concerned", testArray[2]);
	   	assertEquals("curious", testArray[3]);
	   	assertEquals("engrossed", testArray[4]);
	   	assertEquals("fascinated", testArray[5]);
	   	assertEquals("snoopy", testArray[testArray.length - 1]);
	}


	@Test
	public void testInsertIntoArray() {
	   	int[] testArray = { 3, 6, 8, 3, 3, 2, 98 };
	   	testArray = new Inserting().insertAt(testArray, 5, 3);
	   	assertEquals(3, testArray[0]);
	   	assertEquals(3, testArray[4]);
	   	assertEquals(3, testArray[5]);
	}


	@Test
	public void testInsertInOrder() throws Exception {
	   	String[] orderedArray = { "concerned", "affected", "fascinated",
	           	"intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
	           	"engrossed", "curious" };
	   	new Sorting().sort(orderedArray);


	   	new Inserting().insertAlphabetically(orderedArray, "groovy");
	   	assertEquals("absorbed", orderedArray[0]);
	   	assertEquals("groovy", orderedArray[6]);
	   	assertEquals("snoopy", orderedArray[8]);
	}



}
