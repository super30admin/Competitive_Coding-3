// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class PascalTriangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> li = new ArrayList<>();

            li.add(1);
            result.add(li);

            for(int i = 1; i < numRows; i++){
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j <= i - 1; j++){
                    List<Integer> prevLi = result.get(i - 1);
                    if(j == 0){
                        list.add(prevLi.get(j));
                    }
                    else if(j > 0){
                        list.add(prevLi.get(j) + prevLi.get(j-1));
                    }
                }
                list.add(1);
                result.add(list);
            }
            return result;
        }
    }
}
