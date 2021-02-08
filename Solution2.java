// Time Complexity : O(N^2)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N


// Your code here along with comments explaining your approach
-> add 1 at first & last position for each row, other positions are sum of element of prev row as (i) + (i-1)

class Solution {
    public List<List<Integer>> generate(int n) {
        if(n==0)
            return new LinkedList<List<Integer>>();

        List<List<Integer>> result = new LinkedList<>();

        List<Integer> first = new LinkedList<>();
        first.add(1);
        result.add(first);

        for(int i=1;i<n;i++){
            List<Integer> current = new LinkedList<>();
            current.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prevRow = result.get(i-1);
                current.add(prevRow.get(j)+prevRow.get(j-1));
            }
            current.add(1);
            result.add(current);
        }

        return result;
    }
}