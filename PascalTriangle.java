import java.util.ArrayList;
import java.util.List;
//tc = o(numRows^2)
//sc = o(1)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> prevRow = result.get(i-1);
            list.add(0,1);
            for(int j=1;j<i;j++){
                list.add(prevRow.get(j) + prevRow.get(j-1));
            }
            list.add(1);
            result.add(list);

        }
        return result;
    }
}