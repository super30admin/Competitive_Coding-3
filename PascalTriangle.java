// Time Complexity : O(mn) where m is the number of rows and n is the number of columns in the Pascal matrix
// Space Complexity : O(1) if we are not considering the result list as extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : The initial case where [1] and [1,1]. Entered Mannually as it messes up the loop.
/*Algorithm: Add [1] initially, it cant be done on loop. Then for the every time you introduce the temporary list (temp), add a 1 in the start.
In the j loop, take the previous row and add the sum between the previous row's jth element and j-1th element, and enter the result into temp.
As you come out of j loop, add the 1 too at the end as Pascal made this rule. Add the temp list to the result list. Repeat the same till numRows.
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows  <= 0){                          // edge case
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);                       // Adding initial [1]
        for(int i = 1; i < numRows ; i++){
           int sum = 0;
           List<Integer> temp = new ArrayList<>();
            temp.add(1);                                        // Appending a 1 at the start always.
            for(int j = 1; j < i; j++){
                sum= result.get(i-1).get(j-1) + result.get(i-1).get(j);                 // DP concept: Use your previous values to get the current value
                temp.add(sum);
            }
            temp.add(1);                                    // Appending a 1 at the end of the temp as Pascal wants it
            result.add(temp);                               // Appending the temp list to the result
        }
        return result;
    }
}