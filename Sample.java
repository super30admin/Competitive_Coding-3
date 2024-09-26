import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

/**
 * Implementation problem. Put 1 in the first list.
 * from next row, fetch the previous row and add the
 * jth and j-1th elements from 1 to i-1th index. for 0 and
 * ith index, put 1 in the current row and push that to ans list.
 * return ans list.
 *
 */
class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		first.add(1);
		ans.add(first);
		for (int i = 1; i < numRows; i++) {
			List<Integer> res = new ArrayList<>();
			List<Integer> prev = ans.get(i - 1);
			res.add(1);
			for (int j = 1; j < i; j++) {
				res.add(prev.get(j - 1) + prev.get(j));
			}
			res.add(1);
			ans.add(res);
		}
		return ans;
	}
}