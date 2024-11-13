// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    //TC:N^2
    //SC N^2
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows+1][numRows+1];
        List<List<Integer>> result = new ArrayList<>();
        dp[1][1]=1;
        List<Integer>level1 = new ArrayList();
        level1.add(1);
        result.add(level1);
        for(int i=2;i<=numRows;i++){
            List<Integer> level = new ArrayList<>();
            for(int j=1;j<=numRows;j++){
                dp[i][j]= dp[i-1][j-1]+dp[i-1][j];
                if(dp[i][j]>0){
                    level.add(dp[i][j]);
                }
            }
            result.add(level);

        }
        return result;
    }

}