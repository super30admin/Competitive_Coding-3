// Time Complexity :O(n*n) where n is the number of rows we need to build as we need to build lists of 1+2+3...n elements which = n*(n+1)/2
// Space Complexity :O(1) as no auxiliary data structure used
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> level1List = new ArrayList<>();
        level1List.add(1);
        result.add(level1List);
        int level =1;

        if(numRows == 1){
            return result;
        }

        while(level < numRows){

            List<Integer> prevList = result.get(level-1);
            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            int idx = 1;

            while(idx < prevList.size()){

                currentList.add(prevList.get(idx) + prevList.get(idx-1));
                idx++;
            }
            currentList.add(1);
            level++;

            result.add(currentList);
        }
        return result;

    }
}
