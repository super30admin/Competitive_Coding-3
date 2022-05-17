// Time Complexity : O(n ^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    result.add(list1);
    List<Integer> prev = list1;
    for(int i =1; i < numRows; i++){
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        for(int j= 0 ; j< prev.size()-1 ; j++){
            int sum = prev.get(j) + prev.get(j+1);
            list2.add(sum);
        }
        list2.add(1);
        result.add(list2);
        prev = list2;
    }
    return result;
}
}