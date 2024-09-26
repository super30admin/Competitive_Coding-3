//Time Complexity: O(numRows * numRows)
//Space Complexity: O(1)
//Leetcode: yes
import java.util.*;
public class PascalsTriangle {
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> result = new ArrayList<>();

            int i = 0;

            while (i < numRows) {
                List<Integer> l = new ArrayList<Integer>();
                l.add(1);
                if (i != 0) {
                    int sum = 0;
                    for (int j = 1; j < result.get(i-1).size(); j++ ) {
                        sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                        l.add(sum);
                    }
                    l.add(1);
                }
                i++;
                result.add(l);
            }

            return result;
        }
}
