// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = Arrays.asList(1);
        res.add(temp);
        for(int i = 1; i < numRows; i++){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int j = 1; j < i ; j++){
                tmp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            tmp.add(1);
            res.add(tmp);
        }
       return res; 
    }
    
}