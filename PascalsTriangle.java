import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> each = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    each.add(1);
                }
                else{
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    each.add(left+right);
                }

            }
            result.add(each);
        }
        return result;

    }

    public static void main(String[] args) {
        List<List<Integer>> ans = PascalsTriangle.generate(5);
        System.out.println(ans);
    }
}
