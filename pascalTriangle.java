// Time Complexity : O(n).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach : We can construct a row from previous row by adding index and index-1 of previous row for a index in current row.
// And append 1 at both the ends of the row. As the output is expected in List<List<Integer>>, we perform operations on the List.


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows >= 1){
            result.add(new ArrayList<>(Arrays.asList(1))); // first row is always [1]
        }
        for(int i=1;i<numRows;i++){
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = new ArrayList<>();
            prev = result.get(i-1);
            curr.add(1); //first elements is always 1
            for(int j=1;j<prev.size();j++){
                curr.add(prev.get(j)+prev.get(j-1)); //previous row's index sum
            }
            curr.add(1);//last element is always 1
            result.add(curr);
        }
        return result;
    }
}