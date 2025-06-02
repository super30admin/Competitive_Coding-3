// Build Each Next Row:
// For rows i = 2 to numRows, build each row using the previous row. The first and last elements of every row are 1.
// Each middle element is the sum of two values from the previous row: prevRow[j - 1] + prevRow[j].
// Add New Row to Result:
// After building the row, add it to the result list. Repeat until all rows are generated.
//  Time Complexity (TC): O(numRows²)
// Space Complexity (SC): O(numRows²)


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        if(numRows == 1){
            return res;
        }
        for(int i = 2; i<= numRows ; ++i){
            int j=0;
            List<Integer> pass = new ArrayList<>();
            while(j < i){
                if(j == 0 || j == i-1)
                    pass.add(1);
                else{
                    pass.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
                }
                ++j;
            }
            res.add(pass);
        }
        return res;
    }
}
