// Time Complexity : O(N**2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<>();
        al.add(1);
        ans.add(al);
        
        for(int i=1;i<numRows;i++) {
            
            List<Integer> prev = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            
            for(int j=0;j<i-1;j++) {
                curr.add(prev.get(j) + prev.get(j+1));
            }
            curr.add(1);

            ans.add(curr);
        }
        
        return ans;
    }
}
