// Time Complexity : O(n^2) as total number of elements in the triangle is n(n+1)/2
// Space Complexity : O(1) as we are not using any extra space - just the result list that we return 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Created a list of lists to store the result. For each row, created a temporary list and added 1 at the start and end. For the elements in between, added the sum of the two elements above it from the last row.

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        for(int i = 1; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> lastRow = res.get(res.size()-1);
            for(int j = 1; j<i; j++){
                temp.add(lastRow.get(j-1) + lastRow.get(j));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}