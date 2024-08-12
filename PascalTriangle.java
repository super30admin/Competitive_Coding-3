import java.util.ArrayList;
import java.util.List;
// essentially we figured out that there is a pattern,
// and the leftmost and rightmost indexes will have 1 .
// the rest will have previous row j-1 and previous row j as the sum.
// Time complexity = O(n)
// space complexity= O(1)
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        // we have the num rows
        for(int i=0;i< numRows;i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j< i+1;j++) {
                if(j==0 || j== i) {// handles the extreme left and right indexes.
                    list.add(1);
                } else {
                    int left = res.get(i-1).get(j-1);// previous index previous column.
                    int right = res.get(i-1).get(j);// previous index same column.
                    list.add(left+right);// add them.
                }
            }
            res.add(list);
        }
        return res;
    }
}
