// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> generate(int numRows) {
        res = new ArrayList<>();
        if(numRows == 0) return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for(int i = 1; i < numRows; ++i)
        {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j = 1; j < i; ++j)
            {
                l.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            l.add(1);
            res.add(l);
        }
        return res;
    }
}

//TC : O(numRows^2)
// SC : O(numRows^2)
