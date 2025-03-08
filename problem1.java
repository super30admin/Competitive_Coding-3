import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Time: O(n^2)
// Space : O(n)
public class problem1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        for (int i=0;i<numRows;i++)
        {
            List<Integer> row= new ArrayList<>(Collections.nCopies(i+1,1));

            for (int j=i-1;j>0;j--)
            {
                row.set(j, res.get(i-1).get(j-1) +  res.get(i-1).get(j));
            }
            res.add(row);

        }
        return res;
    }
}
