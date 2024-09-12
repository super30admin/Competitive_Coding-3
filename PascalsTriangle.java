// Time Complexity : O(numRows^2)
// Space Complexity : O(numRows)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());
        res.get(0).add(1);

        if(numRows == 1)
            return res;

        res.add(new ArrayList<>());
        res.get(1).add(1);
        res.get(1).add(1);

        if(numRows == 2)
            return res;

        int r = 2;
        int c = 0;
        int n = 3;

        while(r < numRows){
            List<Integer> li = new ArrayList<>();
            List<Integer> prev = res.get(r-1);
            for(int j=c; j< n; j++) {
                if (j == 0 || j == n-1)
                    li.add(1);
                else {
                    li.add(prev.get(j - 1) + prev.get(j));
                }
            }
            res.add(li);
            r++;
            n++;
        }
        return res;
    }
}
