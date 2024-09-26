// Time Complexity : O(n^2) where n is input integer
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;
public class PascalTriangle{
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return new ArrayList<>();
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }
}