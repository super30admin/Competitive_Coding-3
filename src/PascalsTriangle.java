// https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> previousRow = new ArrayList<>();
        List<Integer> currentRow = new ArrayList<>();

        currentRow = new ArrayList<>(Arrays.asList(1)); 
        result.add(currentRow);                                                      // adding [1] in result
        if(numRows == 1)                                       
            return result;

        currentRow = new ArrayList<>(Arrays.asList(1,1));
        result.add(currentRow);                                                      // adding [1,1] in result
        if(numRows == 2)
            return result;

        previousRow = currentRow;                                                    // updating previous row

        for(int i=2; i<numRows; i++) {
            currentRow = new ArrayList<>(Arrays.asList(1,1));                        // starting with [1,1] for each row
            for(int j=1; j<i; j++) {
                int value = previousRow.get(j-1) + previousRow.get(j);
                currentRow.add(j, value);                                            // updating current row at indexes
            }
            previousRow = currentRow;                                                // updating previous row
            result.add(currentRow);                                                  // adding current row in result
        }

        return result;

    }
}
