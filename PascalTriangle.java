import java.util.*;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        triangle.add(firstList);
        
        System.out.println(triangle);
        
        for(int i=1; i<numRows; i++){
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for(int j=1; j<i; j++){
                newList.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            newList.add(1);
            triangle.add(newList);
        }
        
        return triangle;
    }
}