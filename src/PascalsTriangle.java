import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
// Time complexity = O(N^2)
// Space Complexity = O(N)
public class PascalsTriangle {
        public List<List<Integer>> generate(int numRows) {
            int i = 0;
            int j = 0;

            List<Integer> list ;
            List<List<Integer>> result = new ArrayList<>();
            for( i =0; i<numRows; i++) {
                list = new ArrayList<>();
                Collections.sort(list);
                list.add(0,1);
                for(j=1; j<i;j++) {
                    list.add(j, (result.get(i-1).get(j-1)+result.get(i-1).get(j)));
                }
                if(i!=0)
                    list.add(j,1);
                result.add(list);
            }
            return result;
        }
        public static void main(String args[]) {
            PascalsTriangle pas = new PascalsTriangle();
            System.out.println(pas.generate(5));
        }
}
