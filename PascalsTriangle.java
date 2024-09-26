// Time Complexity : O(N*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows == 0)
            return result;    
                
        // every element except the first and last is calculated as dp[i-1][j] + dp[i-1][j-1]   
        // using only the list and not the dp array thereby reducing the space complexity from O(N*N) to O(1)    
        for(int i=0; i<numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || i == j) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(temp);
        }
        
        return result;            
    }
}