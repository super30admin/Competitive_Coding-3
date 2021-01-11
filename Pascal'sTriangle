// Time Complexity : O(n^2) where n is number of rows.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList();
            List<List<Integer>> result = new ArrayList();
            for (int i = 0; i < numRows; i++)  // O(n)
            {
                List<Integer> res = new ArrayList();
                for (int j = 0; j <= i; j++) // O(n)
                {
                   
                    if (j == i || j == 0) {
                        res.add(1); 
                    }
                    else
                    {
                        List<Integer> previous = result.get(i - 1);
                        res.add(previous.get(j) + previous.get(j - 1));
                    }
                    
                }
                result.add(res);
            }
            return result;
    }
}


// Your code here along with comments explaining your approach
