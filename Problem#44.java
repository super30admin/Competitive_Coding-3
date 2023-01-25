// Pascal's Triangle

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> li = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    li.add(1);
                } else {
                    int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    li.add(sum);
                }
            }
            result.add(li);
        }
        return result;
    }
}