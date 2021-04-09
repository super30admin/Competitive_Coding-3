//Pascal's Triangle

// Time Complexity :O(n*n) 
// Space Complexity :O(n*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
dynamic programming approach, top down. first make list if numRows would be 1, having 1, 
If numRows would be 2, first & last element of list wil always ahve 1, 1, 
If numRows, would be 3, 1st & last will be 1 and middle ones will be addition of prev list's 
prev index and one idnex +1. and add that to a arraylist and then add it to result list
*/
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
        //for loop for 1 to numRows
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
