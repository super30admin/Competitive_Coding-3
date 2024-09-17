// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	class Solution {
		public List<List<Integer>> generate(int numRows) {
			List<List<Integer>> result = new ArrayList<>();
			if (numRows == 0)
				return result;

			for (int i = 0; i < numRows; i++)
				result.add(new ArrayList());

			for (int i = 0; i < numRows; i++) {
				result.get(i).add(1);
				if (i == 0)
					continue;
				for (int j = 1; j < i; j++) {
					int num = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
					result.get(i).add(num);
				}
				result.get(i).add(1);
			}

			return result;
		}
	}
}
