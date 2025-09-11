// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * For any row, the number of elements is same as the current row count.
 * Setting first and last element to be 1.
 * For calculating the middle elements, looking at previous row and doing the sum of (i-1, j) and (i-1,j-1) elements.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // if first or last element for any row
                if (j == 0 || j == i) {
                    currentRow.add(1);
                }
                // if any other element (will only be used starting from row number 3)
                else {
                    currentRow.add(answer.get(i - 1).get(j) + answer.get(i - 1).get(j - 1));
                }

            }
            answer.add(currentRow);
        }

        return answer;
    }
}