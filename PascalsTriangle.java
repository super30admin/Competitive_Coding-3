// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
The idea is to append two 1's by default(except for 0th index) to the resultant sublist and compute the
middle elements by retrieving previous iteration's generated list and add the consecutive elements from
indices 1 to i - 1 where i needs to iterate for given numRows value. As we compute this sum, append it to
the subList and add it to the resultant list.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++) {
            List<Integer> pascalList = new ArrayList<>();
            pascalList.add(1);
            if(i == 0) {
                result.add(pascalList);
                continue;
            }
            for(int j = 1 ; j <= i - 1 ; j++) {
                List<Integer> prevList = result.get(i - 1);
                int sum = prevList.get(j - 1) + prevList.get(j);
                pascalList.add(sum);
            }
            pascalList.add(1);
            result.add(pascalList);
        }
        return result;
    }
}