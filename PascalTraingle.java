// Time Complexity : O(n^2)
// Space Complexity : O(n^2) - required to store all rows in the output List<List<Integer>>
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1) Start with the first row [1] in result.
// 2) For each new row, begin and end with 1, and fill middle elements from sums of two adjacent values in the previous row.
// 3) Append each generated row to the result list.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j = 1; j < prevRow.size(); j++) {
                curRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            curRow.add(1);
            result.add(curRow);
        }
        return result;
    }
}
