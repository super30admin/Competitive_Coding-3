// Time Complexity : O(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//initiated the first row as 1 and push to result list
//from second row to row-1 i have calulated the sum of previous row,prev column and prev row,same column and pushed to the list.
//at the end i pushed 1


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        in.add(1);
        result.add(in);
        int i,j;
        for(i=1;i<numRows;i++){
            List<Integer> li = new ArrayList<>();
            li.add(1);
            for(j=1;j<i;j++){
                 li.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            li.add(1);
            result.add(li);
            
        }
        return result;
    }
}