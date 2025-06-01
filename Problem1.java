// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : not very much

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curArr = new ArrayList<>();
            List<Integer> prevArr = result.get(i - 1);
            curArr.add(1);
            for (int j = 1; j < prevArr.size(); j++) {
                curArr.add(prevArr.get(j - 1) + prevArr.get(j));
            }
            curArr.add(1);
            result.add(curArr);
        }
        
        return result;
    }
}