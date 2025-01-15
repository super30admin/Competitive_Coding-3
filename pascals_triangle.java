// Time Complexity :O(n^2)
// Space Complexity :O(n^2)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        res.add(inner);
        for(int i = 1; i < numRows; i++){
            List<Integer> li = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || j==i){
                    li.add(1);
                }else{
                //    i = 2 -> [1,2,1]
                //     [1, ]
                //     // i = 3
                //     j = 1

                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    li.add(left + right);
                }
            }
            res.add(li);
        }

        return res;
        
    }
}