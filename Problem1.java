//Pascal's Triangle

// Time Complexity :O(n*n) 
// Space Complexity :O(n*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
public class Problem1 {
    public static void main(String[] args){
        List<List<Integer>> res = generate(5);
        System.out.println(res);

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res  = new ArrayList<>();
        if(numRows ==0)
            return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);
        
        for(int i = 1;i< numRows; i++){
            List<Integer> eachNumList = new ArrayList<>();
            List<Integer> prevNumList = res.get(i-1);
            
            //// first and last row element is 1
            eachNumList.add(1);
            
            for(int j = 1;j< i;j++){
                eachNumList.add(prevNumList.get(j-1) + prevNumList.get(j));
            }
            
            eachNumList.add(1);
            res.add(eachNumList);
            
        }
        return res;
    }
}