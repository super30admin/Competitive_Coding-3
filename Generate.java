// Time Complexity : The time complexity is O(n2) where n is the number of rows to be generated
// Space Complexity : The space complexity is O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new LinkedList<>();

        for(int i=0;i<numRows;i++){

            List<Integer> list = new LinkedList<>();

            for(int j=0;j<i+1;j++){

                // The first and last elements in the list are 1
                if(j==0 || j==i){
                    list.add(1);
                }
                // Remaining elements is the sum of previous 2 elements
                else{
                    int val = output.get(i-1).get(j) + output.get(i-1).get(j-1);
                    list.add(val);
                }
            }

            output.add(list);
        }

        return output;

    }
}