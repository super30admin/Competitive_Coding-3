// Time Complexity : O(N*N) 
// Space Complexity : O(N*N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        result.add(prev);
        
        if(numRows==1)
            return result;
        
        for(int i=2;i<=numRows;i++){
            prev= result.get(i-2);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=0;j<prev.size()-1;j++){
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}