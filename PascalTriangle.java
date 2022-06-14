// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows >= 1){
            List<Integer> l1 = new ArrayList<>();
            l1.add(1);
            result.add(l1);
         
        }
        if (numRows >= 2){
           List<Integer> l2 = new ArrayList<>();
            l2.add(1);
            l2.add(1);
            result.add(l2);
              
        }
        for(int i=2;i<numRows;i++){
            List<Integer> l3 = new ArrayList<>();
            l3.add(1);
            for(int j=1;j<=i-1;j++){
            int val = result.get(i-1).get(j-1)+result.get(i-1).get(j);
            l3.add(val);
            }
            l3.add(1);
            result.add(l3);
            
        }
        return result;
    }
}