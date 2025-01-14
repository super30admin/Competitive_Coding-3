import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes

// Your code here along with comments explaining your approach
// iterating over each cell and if column is 0 or column is n-1, add 1 to the result list
// otherwise calculate the sum of the elements in the previous row


public class PascalTriangle {
        public List<List<Integer>> generate(int n) {
            List<List<Integer>> pascalList = new ArrayList<>();
            for(int i=0;i<n;i++){
                List<Integer> row = new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i){
                        row.add(1);
                    }else{
                        row.add( pascalList.get(i-1).get(j-1)+ pascalList.get(i-1).get(j));

                    }
                }
                pascalList.add(row);
            }
            return pascalList;
        }
}
