class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

        // Zero'th row
        result.add(new ArrayList<Integer>());
        result.get(0).add(1); // first element of the pascal's triangle

        for(int i=1;i<numRows;i++){
            List<Integer> currRow = new ArrayList<>();
            result.add(currRow);
            result.get(i).add(1); // left most element
            // Access the prev row
            List<Integer> prevRow = result.get(i-1);
            for(int j=1;j<i;j++){
                result.get(i).add(prevRow.get(j-1)+prevRow.get(j));
            }
            // right most element
            result.get(i).add(1);

        }
        return result;
    }
}

// Time :  O(numsRows^2) //we are generating all the elements of the Pascal's Triangle
// Space : O(O(numRows))
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1); // first element of the Pascal's Triangle

        for (int i = 1; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1); // first element of the currentRow (left-most element)
            List<Integer> prevRow = result.get(i - 1);
            for (int j = 1; j < i; j++) {
                // next row middle element are the sum of prev row elements
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1); // adding right most element as 1 in currentRow
            result.add(currRow);
        }
        return result;
    }
}