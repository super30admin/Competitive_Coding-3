// TC - O(n^2), SC - O(n^2)

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static void main(String[] args) {
		// creating a result to store each levels data
		List<List<Integer>> result = new ArrayList<>();
		int level = 5;
		// Iterating through number of levels we mention
		for(int i=0; i<level; i++) { 
			// creating a new List to store each level elements
			List<Integer> subList = new ArrayList<>();
			for(int j=0; j<=i; j++) { 
				// if 0 or at end of each level, value should be 1, add that 1 to subList
				if(j == 0 || j == i) {
					subList.add(1);
				}else {
					// Getting two points, x and y, these are previous list j-1th index and jth index, we will add up these both and add to subList. 
					int x = result.get(i-1).get(j-1); 
					int y = result.get(i-1).get(j); 
					subList.add(x+y);
				}
			}
			// Add sublists one by one into result.
			result.add(subList);
		}
		System.out.println(result);
	}
}