// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    
    //  Time complexity - O(numRows^2)
    //  Space complexity - O(numRows) for curr list
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0)
            return res;
        
        for(int i = 0; i < numRows; i++){
            List<Integer> curr = new ArrayList<>(); 
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    curr.add(1);
                }else{
                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    curr.add(left + right);
                }
            } 
            res.add(curr);
            
        }
        
        return res;
    }
}