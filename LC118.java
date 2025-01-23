// TC: O(n^2)
// SC: O(1) (ignoring the space used for input and output)
// where n is numRows in the input.


import java.util.ArrayList;
import java.util.List;

public class LC118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int row = 1;
        while(row<=numRows){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            int i = 0, j = 1;
            while(i<=row-2 && j<=row-2){
                l.add(ans.get(row-2).get(i) + ans.get(row-2).get(j));
                i++;
                j++;
            }
            if(row>1) l.add(1);
            ans.add(l);
            row++;
        }
        return ans;
    }
}
