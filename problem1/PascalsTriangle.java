// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> baseRow = new ArrayList<Integer>();
		baseRow.add(1);
		triangle.add(baseRow);

		for (int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> prevRow = triangle.get(i - 1);
			// row.add(1);
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
					continue;
				}
				row.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			triangle.add(row);
		}

		return triangle;
	}

	public static void main(String[] args) {
		PascalsTriangle obj = new PascalsTriangle();
		int n = 2;
		List<List<Integer>> ans = obj.generate(n);

		System.out.println("Triangle: \n " + ans);
	}
}
