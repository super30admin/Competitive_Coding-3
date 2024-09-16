// Time - O(numRow^2)
// Space - O(numRow^2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) {
            return result;
        }
        
        List<Integer> first = new ArrayList<Integer>();
        
        first.add(1);
        result.add(first);
        for(int i = 1;i<numRows;i++) {
            List<Integer> prevRow = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++) {
                row.add(prevRow.get(j) + prevRow.get(j-1));
            }
            row.add(1);
            result.add(row);
        }
        
        return result;
    }
}
