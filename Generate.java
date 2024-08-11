// Problem 118. Pascal's Triangle
// Time Complexity : O(n*n)
// Space Complexity : O(n*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0){
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int i=1; i<numRows; i++){
            List<Integer> prev = triangle.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<i; j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle;
    }
}
