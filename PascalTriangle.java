/*
    Time Complexity - O(N ^ 2) N - numRows
    Space Complexity - O(1) excluding the result set's space.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(numRows <= 0)
            return result;
        
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        
        for(int i = 1; i < numRows; i++){
            row = new ArrayList<>();
            row.add(1);
            
            List<Integer> prev = result.get(i - 1);
            for(int j = 0; j < i - 1; j++) {
                int sum = prev.get(j) + prev.get(j + 1);
                row.add(sum);
            }
            
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
