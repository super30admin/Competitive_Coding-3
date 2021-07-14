// Time Complexity : O(n^2). n is the numRows
// Space Complexity :O(n^2). At each row , i number of lists are used. Hence O(n^2)space is required
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        //the first row is always one
        first.add(1);
        result.add(first);
        //iterate to add the rows
        //start from first row
        for(int i=1;i<numRows;i++){
            //get the previous list(row) elements
            List<Integer> prev_row = result.get(i-1);
            //create a new list for ith row
            List<Integer> curr_row = new ArrayList<>();
            //the first element of each row is always one
            curr_row.add(1);
            //iterate i-1 times in each row
            for(int j=1;j<i;j++){
                //to determine the value of j the element, get the value from the previous row and previous col and current col and add them
                curr_row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            //the last element in each row is always one
            curr_row.add(1);
            //add this row to the final list
            result.add(curr_row);
        }
        return result;
    }
}