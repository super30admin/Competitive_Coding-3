// Time Complexity : O(k*m) , k is rowIndex+1 and m is number of elements in rowIndex+1
// Space Complexity : O(k), k is rowIndex
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(); //result arraylist
        if(rowIndex < 0) {
            res.add(1);
            return res; 
        }
        List<Integer> temp = new ArrayList<>(rowIndex); //extra o(k) space
        res.add(1); //add 1st element value = 1 in both res and temp
        temp.add(1);
        //loop from 1 to rowindex (included) as we need to add last value (rowIndex = 1) (for k =3, O/p = [1,3,3,1], 4 values, so rowIndex<=)
        for(int i = 1; i <= rowIndex; i++){
            //loop to fill, 1st index elements onwards, till last 2nd
            // as last element = 1a
            for(int j = 1; j < i; j++) {
                //val will be prev res (stored in temp)
                //res of j will be temp of(j-1)+j ; index positions = j-1 and j 
                res.set(j, temp.get(j-1)+temp.get(j));
            }  
            //copy res to temp
            temp.addAll(0,res);
            // add last element to res, not to temp as only O(k) extra space
            // last element not used for any computation and is always = 1
            res.add(1);   
        } return res;        
    }
}
