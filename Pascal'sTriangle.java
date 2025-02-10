import java.util.ArrayList;
import java.util.List;

class Solution {
    // Time Complexity: O(n^2)
    // Space Complexity: O(n^2)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements are always 1
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            
            triangle.add(row);
        }
        
        return triangle;
    }
}