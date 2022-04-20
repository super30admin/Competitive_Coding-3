/**
Problem: https://leetcode.com/problems/pascals-triangle/
TC: O(n^2) - total elements in a pascals triangle of length n ==> 1 + 2 + ... + n = n(n-1) / 2 
SC: O(1)
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (numRows == 0) {
            return res;
        }
        res.add(new ArrayList<>(Arrays.asList(1)));
        
        for (int i = 1; i <= numRows-1; ++i) {
            int size = res.get(i-1).size() + 1;
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < size - 1; ++j) {
                row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}