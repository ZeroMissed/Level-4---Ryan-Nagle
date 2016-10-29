import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class BinarySearch {
	public static void main(String[] args) {
		Random numGen = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 1000000; i++) {
			nums.add(new Random().nextInt());
		}

		Collections.sort(nums);
		System.out.println(binarySearch(nums, 110));
		System.out.println(Collections.binarySearch(nums, 110));
		
	}
	public static Integer binarySearch(ArrayList<Integer> nums, int find) {
		int index = nums.size()/2;
		int start = 0;
		int end = nums.size();
		if(!nums.contains(find)){
			System.out.println("This number is not in the list");
			return -1;
		}
		
		while((int) nums.get(index) != find) {
			//System.out.println(index);
			if(find > (int) nums.get(index)) {
				start = index;
				index+= (end - start)/2;
			} else {
				end = index;
				index-=(end - start)/2;
			}
		}
		return index;
		
	}
}
