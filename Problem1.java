import java.util.*;
// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
public class Problem1 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);  // [[1]] // As the first list would always be 1 fix it.
        if(numRows == 1){
            return ans;
        }

        for(int i = 1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            //as seen first and last element is always 1 fix them
            list.add(1);
            for(int j = 1;j<i;j++){
                List<Integer> fetch = ans.get(i-1);
                //the element would be sum of element just above and [just above ,- row]
                list.add(fetch.get(j-1)+fetch.get(j));
            }
            //last element will always be 1
            list.add(1);
            ans.add(list);
        }
        return ans;
    }
}
