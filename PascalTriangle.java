//Problem : 43 - Pascal Triangle
// Time Complexity : O(numRows*numRows)
// Space Complexity : O(1), because we are not using any auxilary array or list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//First and last element of each row will be 1 and middle elements will be sum of top left element which is previous row & previous column and top element which is previous row & current column

import java.util.*;
class Solution43 {
    public List<List<Integer>> generate(int numRows) {
       
         List<List<Integer>> res = new ArrayList<>(numRows);
        
        if(numRows<=0){
            return res;
        }
        //TC: O(numRows*numRows), SC: O(1)
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=i;j>=0;j--){ 
                if(j==i || j==0){
                    row.add(1);
                }else{
                    int topLeftElem = res.get(i-1).get(j-1);//element at previous row and previous column
                    int topElem     = res.get(i-1).get(j);//element at previous row and current column
                    row.add(topLeftElem+topElem);
                }
            }
            res.add(row);
        }
        return res;
    }
}