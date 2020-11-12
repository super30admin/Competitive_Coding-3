// Time Complexity :  O(N)
// Space Complexity : O(N)  // using temp array list
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //edge case
        if(numRows == 0) return new ArrayList<List<Integer>>();
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        res.add(l);
        
        for(int i = 1; i < numRows; i++ ){ 
            List<Integer> m = new ArrayList<>();
            List<Integer> prev = res.get(i-1);
            m.add(1);
            for(int j = 1 ; j < i; j++){
                int a = prev.get(j-1) + prev.get(j);
                m.add(a);
            }
            m.add(1);
            res.add(m);
        }
        return res;
    }
}