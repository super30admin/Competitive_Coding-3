import java.util.ArrayList;
import java.util.List;
//TC O(N*M)
//SC O(n)
public class Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0,1);
            for (int j = 1; j <row.size()-1 ; j++) {
                row.set(j,row.get(j)+row.get(j+1));
            }
            output.add(new ArrayList<>(row));
        }
        return output;
    }
}
