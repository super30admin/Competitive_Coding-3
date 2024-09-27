// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class Pascals_Triangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0; i<numRows; i++){
			List<Integer> rows = new ArrayList<>();
			for(int j=0; j<=i; j++){
				if(j == 0 || j == i)    // if index is at first or last, add 1 to the first and last elements
					rows.add(1);

				else{
					rows.add(result.get(i-1).get(j-1) + result.get(i-1).get(j)); //sum of the previous row's previous column and previous row's current column.
				}
			}
			result.add(rows);
		}
		return result;
	}

	public static void main(String[] args) {
		int numRows = 5;
		System.out.println(generate(numRows));
	}
}
