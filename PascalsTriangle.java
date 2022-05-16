// Time Complexity :O(n^2)
// Space Complexity :O(n^2)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

//will be adding element at one level up and one level up and j-1 except at index 0 and index[i][RowNumber]/last element of the row

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) {
            return result;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            for (int j = 1; j < i + 1; j++) {
                if (j == i) {
                    temp1.add(1);
                } else {
                    int left = result.get(i - 1).get(j - 1);
                    int above = result.get(i - 1).get(j);
                    temp1.add(left + above);
                }
            }
            result.add(temp1);
        }
        return result;
    }
}