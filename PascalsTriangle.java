class PascalsTriangle {

    // Time Complexity: O(n^2)  (where n -> no. of rows)
    // Space Complexity: O(n^2)

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // Edge Case Checking
        if(numRows == 0)
            return result;
        
        // Base Case when we always add [[1]]
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(i-1);
            
            // Append 1 at the beginning
            row.add(1);
            
            for(int j = 1; j < i; j++){
                // New value = element above and left + element above
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            
            // Append 1 at the end
            row.add(1);
            result.add(row);
        }
        
        return result;
    }
}