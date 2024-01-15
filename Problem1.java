//Accepted ON LT
//It was a dp problem just make a matrix and by using some base cases and than get the row user wants.
//TIme would O(mn) [size of matrix]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        dp[0][0] = 1;
        List<List<Integer>> li = new ArrayList<>();
        li.add(Arrays.asList(1));
        if(numRows==1){
            return li;
        }
        dp[1][0] = 1;
        dp[1][1] = 1;
        li.add(Arrays.asList(1, 1));
        for(int i=2;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<numRows;j++){
                
                if(i>=j){
                    if(j==0 || j==i){
                        dp[i][j] = 1;
                        l.add(1);
                    }
                    else{
                        dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                        l.add(dp[i][j]);
                    }



                }
                

            }
            li.add(l);
        }
        return li;

        
    }
}