// Time Complexity : O(N^2)
// Space Complexity : O(1)

// Approach:
//     For given row i, the computation would be to get row i-1.
//     For given column j, the computation would be the sum of (j-1) & j index of row i-1.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows<1){
            return new ArrayList<>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Adding firstRow
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        for(int i = 1; i<numRows; i++){
            List<Integer> cur = new ArrayList<>();
            
            // Adding first column of ith row
            cur.add(1);
            
            // Adding jth column of ith row
            for(int j = 1; j< i; j++){
                cur.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            
            // Adding last column of ith row
            cur.add(1);

            // Adding List to the resultant list
            result.add(cur);
        }
        return result;
    }
}