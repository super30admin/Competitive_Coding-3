// Time Complexity : O(N*N)
// Space Complexity : O(N*N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows == 0)
            return result;
        
        // create a dp array with numRows dimensions
        int[][] dp = new int[numRows][numRows];
                
        // every element except the first and last is calculated as dp[i-1][j] + dp[i-1][j-1]
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<=i; j++) {
                if(j==0 || i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                }
            }
        }
        
        // convert the dp array into a list of list of integers
        for(int i=0; i<numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<numRows; j++) {    
                if(dp[i][j] == 0)
                    break;
                temp.add(dp[i][j]);
                
            }
            result.add(temp);
        }
        
        return result;            
    }
}