package CP3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * At every new row>=3 we retrieve the previous row and take the sum of its elements 
 * for second to second last element of the new row. First and last indices are always 1.
 * 
 * Time Complexity :
 * O(n^2) where n is the rows to be given
 * 
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<>();

		List<Integer> innerList = new ArrayList<Integer>();
		innerList.add(1);
		list.add(innerList);

		if (numRows == 1)
			return list;

		List<Integer> innerList2 = new ArrayList<Integer>();
		innerList2.add(1);
		innerList2.add(1);
		list.add(innerList2);

		if (numRows == 2)
			return list;

		for (int i = 2; i < numRows; i++) {
			List<Integer> prev = list.get(i - 1);
			Integer[] arr = new Integer[i + 1];
			arr[0] = 1;
			arr[i] = 1;
			int p = 1;
			for (int j = 0; j <= prev.size() - 2; j++) {
				arr[p] = prev.get(j) + prev.get(j + 1);
				p++;
			}

			list.add(Arrays.asList(arr));
		}

		return list;

	}

}
