// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer> rowList = new ArrayList<>();
            rowList.add(1);
            for(int j=1;j<ans.get(i-1).size();j++){
                rowList.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            rowList.add(1);
            ans.add(rowList);
        }
        return ans;
    }
}