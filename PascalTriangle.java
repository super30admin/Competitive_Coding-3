// Time Complexity :O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        // Happy Case
        if(numRows == 0){
            return answer;
        }

        answer.add(new ArrayList<>());
        answer.get(0).add(1);

        for(int i = 1; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 0; j < i - 1; j++){
                list.add(answer.get(i-1).get(j) + answer.get(i-1).get(j+1));
            }

            list.add(1);
            answer.add(list);
        }

        return answer;
    }
}
