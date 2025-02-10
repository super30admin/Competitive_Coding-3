// Pascals triangle

// Time Complexity : O(n*n)
// Space Complexity : O(n*n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, for each row's list, 1 is added at the left. When row index is greater than or equals to 2, element is found using the sum of elements
 * of previous row at that index and previous index. When the row value is greater than 0, 1 is added at the end. List of arrays is returned.
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i>=2){
                List<Integer> prev = list.get(i-1);
                for(int j = 1;j<i;j++){
                    int val = prev.get(j-1)+prev.get(j);
                    row.add(val);
                }
            }
            if(i>0){
                row.add(1);
            }
            list.add(row);
        }
        return list;
    }
}