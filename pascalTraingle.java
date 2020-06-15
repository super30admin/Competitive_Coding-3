// Time Complexity : O(numRows^2)
// Space Complexity : O(1) stack space for recursive
// Did this code successfully run on Leetcode : Yes	
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    
    List<List<Integer>> traingle= new ArrayList<List<Integer>>();
    public List<List<Integer>> generate(int numRows) {    
        if(numRows == 0) return traingle;// empty result
        pascal(numRows);
        return traingle;
    }
    
    private void pascal(int numRows) {
        if(traingle.size() == numRows) return;    //check if pascal triangle is already generated for n rows
        
        traingle.add(new ArrayList<Integer>()); //new array list for every row
        int len = traingle.size()-1; 
        for(int j = 0; j <= len; j++) {       
            if(j == 0 || len == j)
                traingle.get(len).add(1);     //Add 1 to the list if beginning or end of each row
            else {
                int curr = traingle.get(len-1).get(j) + traingle.get(len-1).get(j-1); //Otherwise, calculate sum from previous row values
                traingle.get(len).add(curr);  
            }
        }
        pascal(numRows);
    }
}
