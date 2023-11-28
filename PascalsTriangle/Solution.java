// Time Complexity : O(n log(n) + n) --> O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Yes

/**
 * At each row, starting from 2, each element except the 1st element will be sum of 2 elements from the previous row. One element
 * will be immediately above in the previous row, other will be 1 column behind in the previous row. Add 1 to the start and the
 * end of the list.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>(Arrays.asList(1)));

        for(int i=1; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> temp = result.get(i-1);
            for(int j=1; j<i; j++)
                list.add(temp.get(j-1) + temp.get(j));
            list.add(1);
            result.add(list);
        }

        return result;
    }
}