// Time Complexity : O(n ^ 2) where n = number of rows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {

        // we need to iterate row by row
        //we will store all the elements in the row in the result
        List<List<Integer>> result = new ArrayList<>();

        //Go over each row
        for(int i = 0; i < numRows; i++) {

            List<Integer> list = new ArrayList<>();

            //Go over each column
            for(int col = 0; col <= i; col++) {

                //first and last element should always be 1
                if(col == 0 || col == i) {

                    list.add(1);
                }
                else {

                    //add numbers from previous row
                    int left = result.get(i - 1).get(col - 1);
                    int right = result.get(i - 1).get(col);
                    int sum = left + right;
                    list.add(sum);
                }
            }

            result.add(list);
        }
        
        return result;
    }
}