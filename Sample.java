// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        //Output arraylist
        List<List<Integer>> ans = new ArrayList<>();
        
        if(numRows==0)
            return ans;
        
        ans.add(new ArrayList<>());
      
        //First row will always have a single element as "1" 
        ans.get(0).add(1);
        
        //From 2nd row, the first and last element will be "1" 
        for(int rowNum=1;rowNum<numRows;rowNum++){
            
            //Everytime we will create a new list
            List<Integer> row = new ArrayList<>();
          
            //For the processing of element, we need the lements from the row above, so we will store it in another list
            List<Integer> prevRow = ans.get(rowNum-1);
            
            //First elemnt of every row will be 1
            row.add(1);
            
            //Checking the Jth and (j-1)th element from previous row for the value
            for(int j=1;j<rowNum;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            
            //Last element of every row will be 1
            row.add(1);
            
            //Finally we will add the new row in our output list
            ans.add(row);
        }
        
        return ans;
    }
}
