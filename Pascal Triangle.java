// Time Complexity : O(n*n)
// Space Complexity : O(n*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            
            List<Integer> li = new ArrayList<>();
            
            for(int j = 0; j <= i; j++){
                
                if(j == 0 || j == i){
                    li.add(1);
                } 
                else{
                    int first = output.get(i-1).get(j-1);
                    int second = output.get(i-1).get(j);
                    li.add(first + second);
                }
                
            }
            
            output.add(li);
        }
        
        return output;
    }
}
