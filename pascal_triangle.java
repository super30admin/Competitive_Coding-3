// 118. Pascal's Triangle - https://leetcode.com/problems/pascals-triangle/
// Time Complexity : O(N^2)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++)
        {
            List<Integer> list = new ArrayList<>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    list.add(1);
                
                else
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            res.add(list);
        }
        return res;
    }
}