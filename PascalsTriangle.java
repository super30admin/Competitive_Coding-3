// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));

        if(numRows == 1) return triangle;
        triangle.add(Arrays.asList(1,1));
        if(numRows == 2) return triangle;


        for(int i=2; i<numRows; i++)
        {
            List<Integer> prevRowItems = new ArrayList<>();
            List<Integer> currRowItems = new ArrayList<>();
            int sum = 0;
            prevRowItems = triangle.get(i-1);

            currRowItems.add(1);
            for(int j=1; j<i; j++ )
            {
                sum = prevRowItems.get(j-1) + prevRowItems.get(j);
                currRowItems.add(sum);
            }
            currRowItems.add(1);
            triangle.add(currRowItems);

        }
        return triangle;
    }

    public static void main(String args[]){
        System.out.println(generate(9));
    }
}
