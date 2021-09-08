// Time Complexity: O(n) as we are creating only as much element as row number
// Space Complexity: O(1) as we are not using any additional datastructure
// Did you complete it on leetcode: Yes
// Any problems faced: could not come up with exact implementation

// Write your approach
// Idea here is to iteratively add each row pascal triangle by creating a list of integers
// using function calcNum as it will add previous row prev column and previous row and current column to give new value.
// recursion increments the row and lets us perform same action on each row.
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        rowHelper(0, numRows, triangle);
        return triangle;
    }
    
    public void rowHelper(int i, int numRow, List<List<Integer>> triangle) {
        if(i>=numRow) return;
        else {
            List<Integer> curr = new ArrayList<>();
            for(int p=0; p<=i; p++) {
                curr.add(calcNum(triangle, i, p));
            }
            triangle.add(curr);
            rowHelper(i+1, numRow, triangle);
        }
    }
    
    public int calcNum(List<List<Integer>> triangle, int i, int j) {
        if(j==0 || j==i || i<2) {
            return 1;
        } 
        return triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
    }
}