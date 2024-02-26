// Time Complexity: O(numRows^2)
// Space Complexity: O(numRows^2)

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(1);
        list.add(n);
        for(int i = 1; i < numRows; i++) {
            ArrayList<Integer> in = new ArrayList<Integer>();
            in.add(1);
            for(int j = 1; j < i; j++)
                in.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            in.add(1);
            list.add(in);
        }
        return list;
    }
}
