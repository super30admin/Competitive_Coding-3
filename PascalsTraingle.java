// Time Complexity : O(n*n)
// Space Complexity : O(n) : temp list for storing values at each level
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// In observing the Pascal's traingle, we see that the first and last element at any row is 1. Also, the value at a specific index in my current row is dependent on the values at my previous row at current index and curr index-1 positions.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) { // upto numRows levels
            List<Integer> temp = new ArrayList<>(); // temp list to store values at current level
            for(int j = 0; j <= i; j++) {// i+1 elements at ith level
                if(j == 0 || j == i) { // for handling first and last elements at each row
                    temp.add(1);
                }
                else {
                    int curr = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    temp.add(curr);
                }
            }
            result.add(temp);
        }
        return result;
    }
}