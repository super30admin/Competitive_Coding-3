// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(numRows == 0) return res;
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        
        
        for(int i = 1; i < numRows; i++){
            List<Integer> prev = res.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            
            for(int j = 1; j < i; j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            
            curr.add(1);
            res.add(curr);
        }
        
        return res;
    }
}
