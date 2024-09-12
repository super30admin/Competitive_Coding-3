// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0 ; i < numRows+1; i++){
            List<Integer> sublist = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    sublist.add(1);
                } else {
                    // last element in our result list
                    // and jth element of that list
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    sublist.add(left+right);
                }
            }

            res.add(sublist);
        }

        return res.get(res.size() - 1);
    }
}
