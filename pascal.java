// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

import java.util.*;
// Your code here along with comments explaining your approach
class pascal{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> masterList = new ArrayList<>();
       
       for(int i = 0; i < numRows; i++){
           List<Integer> list = new ArrayList<>();
           for(int j = 0; j <= i; j++){
               if(j == 0 || j == i){
                   list.add(1);
               }else{
                   list.add(masterList.get(i-1).get(j-1)+masterList.get(i-1).get(j));
               }
           }
           masterList.add(list);
       }
       return masterList;
   }
}