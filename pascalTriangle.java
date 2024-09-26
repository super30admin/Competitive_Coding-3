// Time Complexity : O(N^2)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList();
        
        //initializing result list
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=0; i<numRows; i++){
            //initializing a list to store all element of a level and then adding the final list to result list
            List<Integer> list = new ArrayList<>();
            
            for(int j=0; j<=i; j++){
                
                //adding 1 to first and last element
                if(j==0 || j==i)
                    list.add(1);
                //calculating the pascal's triangle value of other elements
                else {
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            
            res.add(list);
        }
        
        return res;
    }
}