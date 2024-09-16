package competitiveCoding3;

import java.util.*;

public class PascalsTriangle {
	//Time Complexity : O(m*n), where m is loop for numRows and n is the size of the longest ArrayList
	//Space Complexity : O(n), for an extra list other than the result, to store the previous array
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        
        if(numRows == 1)
            return res;
        
        int count = 2;
        
        while(count <= numRows) {
            formTriangle(res, count);
            count++;
        }
        
        return res;
    }
    
    private void formTriangle(List<List<Integer>> res, int count) {
        int num = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> curr = res.get(res.size() - 1);
        
        for(int i=1; i<curr.size(); i++) {
            num += curr.get(i);
            list.add(num);
            num = curr.get(i);
        }
        
        list.add(1);
        res.add(list);
    }
}
