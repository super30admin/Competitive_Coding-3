// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // intialize the list to be returned
        ArrayList<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            // create new sublist for each row
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) li.add(1); // first and last element of each row would be 1
                else {
                    // take the upper left and upper right elements, perform addition
                    // add them to the list
                    int left = result.get(i - 1).get(j - 1);
                    int right = result.get(i - 1).get(j);
                    li.add(left + right);
                }
            }
            // add each row to the list
            result.add(li);
        }
        return result;
    }
}