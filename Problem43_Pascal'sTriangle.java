// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 1) {
            result.add(new ArrayList<>(Arrays.asList(1)));
            return result;
        }
        if(numRows == 2) {
            result.add(new ArrayList<>(Arrays.asList(1)));
            result.add(new ArrayList<>(Arrays.asList(1, 1)));
            return result;
        }
        for(int i = 0; i < numRows; i++) {
            List<Integer> helper = new ArrayList<>();
            helper.add(1);
            for(int j = 1; j < i; j++) {
                helper.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            if(i > 0)
                helper.add(1);
            result.add(helper);
        }
        return result;
    }
}