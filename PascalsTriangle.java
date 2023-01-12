// Time Complexity : O(n*2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We can use nested for loops to compute each element
// Each element will be sum of previous row's j-1 and jth value unless i=0 or i=j then it will be 1

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++)
                {
                    if(j==0||j==i) 
                        temp.add(1);
                    else
                        temp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
                result.add(temp);
            }
        return result;
    }
}