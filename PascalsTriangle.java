//The approach here is to calculate each number i which is the sum of numbers at index (i-1,j-1) and index (i-1,j) except for the first and last numbers of a row, which are 1 by default
//Time Complexity: O(n^2)
//Space Complexity: O(n^2), creating a row for each index
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();       
        for(int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                int sum = 0;
                if(j==0 || j==i){
                    row.add(1);
                }
                else{                
                sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                row.add(sum);
                }
            }
            result.add(row);
        }
        return result;
    }
}