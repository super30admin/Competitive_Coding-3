// Time Complexity : O(n^2)
//Pascal's triangle
// Space Complexity : O(1) as no extra space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :Had to lookup list.get function

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // arraylist to store the result
        List<List<Integer>> res = new ArrayList<>();
        // Loop will run number of rows times
        for (int i = 0; i < numRows; i++) {
            // New arraylist for each row which will be added to result
            List<Integer> list = new ArrayList<>();
            // run the loop as the number of elements required in each row
            for (int j = 0; j <= i; j++) {
                // Handling edge case for 1st and last element in each row which will be 1
                if (j == 0 || j == i) {
                    list.add(1);
                    // arr[j] = 1;
                }
                // else Each element will be the sum of its previous row's j and j-1 index
                else {
                    int a = res.get(i - 1).get(j - 1);
                    int b = res.get(i - 1).get(j);
                    // Add the element to list
                    list.add(a + b);
                }
            }
            // Add the list to result
            res.add(list);
        }

        return res;
    }
}
