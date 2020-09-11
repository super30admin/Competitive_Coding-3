// Time Complexity :O(n^2) where n is the number of rows to make
// Space Complexity :O(1) because we are using the same list "res" for every iteration
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // add 1 at the beginning
            res.add(0, 1);

            // for every element except and last ,
            // we add the next element to the current one and update the current one
            for (int j = 1; j < res.size() - 1; j++) {
                res.set(j, res.get(j) + res.get(j + 1));

            }

            // here the line below wont work because res is passed as reference
            // so we need to create a new temp list(using res as param) which we will add to
            // the allrows
            // allRows.add(res);
            allRows.add(new ArrayList<Integer>(res));
        }
        return allRows;

    }
}