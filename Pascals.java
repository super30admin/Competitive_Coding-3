// Time Complexity :O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows <= 0){
            return result;
        }
        
        List<Integer> previous = new ArrayList<>();
        previous.add(1);        
        result.add(previous);
        
        for(int i=2;i<=numRows;i++){
            List<Integer> current = new ArrayList<>();
            
            current.add(1);//first element
            for (int j = 0; j < previous.size() - 1; j++) {
                current.add(previous.get(j) + previous.get(j + 1)); //middle elements
            }
            current.add(1);//last element
            
            result.add(current);
            previous=current;
        }
        return result;
}
        
}
    
   