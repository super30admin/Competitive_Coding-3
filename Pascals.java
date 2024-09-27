
// Time Complexity : O(N^2)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.List;
import java.util.ArrayList;

public class Pascals {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		if (numRows == 0) {
			return list;
		}
		List<Integer> first_row = new ArrayList<>();
		first_row.add(1);
		list.add(first_row);
		for (int i = 1; i < numRows; i++) {
			List<Integer> prev_row = list.get(i - 1);
			List<Integer> curr_row = new ArrayList<>();
			curr_row.add(1);
			for (int j = 1; j < i; j++) {
				curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
			}
			curr_row.add(1);
			list.add(curr_row);
		}
		return list;
	}
}