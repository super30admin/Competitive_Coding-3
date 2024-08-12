//Time Complexity: O(n*n)
//Space Complexity: O(n*n)
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        if(numRows==0){
            return list;
        }
        List<Integer> l = new ArrayList<>();
        l.add(1);
        list.add(l);

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = list.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j=1;j<i;j++){
                currentRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currentRow.add(1);
            list.add(currentRow);

        }

        return list;
    }
}
