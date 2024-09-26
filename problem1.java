// Time Complexity : O(n^2)
// Space Complexity : O(n^2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		res.add(temp);

		for (int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> prevRow = res.get(i - 1);
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
					continue;
				}
				row.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			res.add(row);
		}

		return res;
    }
}