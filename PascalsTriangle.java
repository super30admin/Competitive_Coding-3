// Time Complexity : O(numRows*2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> li = new ArrayList<>();
            if(i==0){
                li.add(1);
            }
            else{
                li.add(1);
                for(int j=1;j<i;j++){
                    li.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
                }
                li.add(1);
            }
            result.add(li);
        }

        return result;
    }

    public static void main(String [] args){
        PascalsTriangle pt = new PascalsTriangle();
        System.out.println(pt.generate(5));
    }
}