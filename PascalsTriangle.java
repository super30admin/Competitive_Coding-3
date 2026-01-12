// TimeComplexity :O(n^2)
// SpaceComplexity :O(1)
// Did you get any issue while submitting in LeetCode: No
// Three lines explanation: Each row starts and ends with 1.
// Every middle element is the sum of the two elements directly above it from the previous row.
// All rows are stored in a list and returned at the end.


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        for(int i =0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();;
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    row.add(1);
                } else {
                    row.add(out.get(i-1).get(j-1) + out.get(i-1).get(j));
                }      
            }  
            out.add(row);
        }
        return out;
    }
}
