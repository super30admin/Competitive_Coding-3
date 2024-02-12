import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    // Time Complexity : O(n^2)
    // Space Complexity : O(n)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);//[1]
        result.add(row1);
        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);//[1,1]
            List<Integer> prevrow = result.get(i-1);//prev row
            for(int j =1; j<i; j++){
                int sum=prevrow.get(j-1)+prevrow.get(j);
                row.add(sum);
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
