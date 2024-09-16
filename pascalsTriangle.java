// Time Complexity : O(N ** 2)
// Space Complexity :  O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// i tried to fill the list from left to right instead of right to left.

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList();
        
        for(int i = 0; i <= rowIndex; i++) {
            result.add(1);
            for(int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
            return result;
    }
}