/**
 * time complexity is O(n*n)
 * space complexity is O(n*n)
 */
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j== i) {
                    row.add(1);
                }
                else {
                    // System.out.println(result.size());
                    List<Integer> prevRow = result.get(result.size() - 1);
                    int val = prevRow.get(j-2) + prevRow.get(j-1);
                    row.add(val);
                }
            }
            result.add(row);
        }
        
        return result;
    }
}