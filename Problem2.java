/*
    LC - 118. Pascal's Triangle
    TC - O(n^2) where 𝑛 n is the number of rows.
    SC - O(n^2) where 𝑛 n is the number of rows.
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows <= 0) {
            return result;
        }
        for(int i=0; i<numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j == 0 || j==i) {
                    temp.add(1);
                } else {
                    int sum = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    temp.add(sum);
                }
            }
            result.add(temp);
        }
        return result;
    }
}